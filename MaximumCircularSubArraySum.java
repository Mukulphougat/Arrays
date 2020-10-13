public class MaximumCircularSubArraySum {
    int maxCircularSum( int arr[], int n ){                 // Naive Solution with O( n ^ 2 ) time complexity.
        int res = arr[0];
        for( int i = 0 ; i < n ; i++ ){
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for( int j = 1 ; j < n ; j++ ){
                int index = ( i + j ) % n ;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max,curr_sum);
            }
            res = Math.max(res,curr_max);
        }
        return res;
    }

    int normalMaxSum(int arr[], int n){
        int res = arr[0];
        int maxEnding = arr[0];
        for( int i = 1 ; i < n ; i++ ){
            maxEnding = Math.max(arr[i],maxEnding);
            res = Math.max(res,maxEnding);
        }
        return res;
    }

    int OverallMaxSum(int arr[], int n){
        int maxNormal = normalMaxSum(arr,n);
        if( maxNormal < 0 )
            return maxNormal;
        int arrSum = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            arrSum += arr[i];
            arr[i] =- arr[i];
        }
        int maxCircular = arrSum + normalMaxSum(arr,n);
        return Math.max(maxNormal,maxCircular);
    }

    public static void main(String args[]){
        int arr[] = {5,-2,3,4};
        MaximumCircularSubArraySum ob = new MaximumCircularSubArraySum();
        int r = ob.maxCircularSum(arr,arr.length);
        System.out.print(r);
        System.out.println();
        int arr1[] = {8,-8,9,-9,10,-11,12};
        int r1 = ob.OverallMaxSum(arr1,arr1.length);
        System.out.print(r1);

    }
}
