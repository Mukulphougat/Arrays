public class FindMaxSumOfK {
    int FindKSum( int arr[] , int k ){  // Sufficient Solution with O(n) time complexity.
        int n = arr.length;
        int curr_sum = 0 ;
        for( int i = 0 ; i < k ; i++ ){
            curr_sum += arr[i];
        }

        int max_sum = curr_sum;
        for( int i = k ; i < n ; i++ ){
            curr_sum += ( arr[i] - arr[i - k]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    public static void main(String args[]){
        int arr[] = {1,8,30,-5,20,7};
        FindMaxSumOfK ob = new FindMaxSumOfK();
        int r = ob.FindKSum(arr,3);
        System.out.print(r);

    }
}
