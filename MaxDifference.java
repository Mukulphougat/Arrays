public class MaxDifference {
    int maxDiff(int arr[], int n){                  // Naive Solution.
        int res = arr[1]-arr[0];
        for( int i = 0 ; i < n - 1 ; i++ ){
            for( int j = i + 1 ; j < n ; j++ )
                res = Math.max(res,arr[j]-arr[i]);
        }
        return res;
    }

    int MaxDiff(int arr1[], int n){                  // Sufficient Solution.
        int res = arr1[1] - arr1[0];
        int MinVal = arr1[0];
        for( int j = 1 ; j < n ; j++ ){
            res = Math.max(res,arr1[j]-MinVal);
            MinVal = Math.min(MinVal,arr1[j]);
        }
        return res;
    }

    public static void main(String args[]){
        int arr[] = {2,3,10,6,4,8};
        MaxDifference ob = new MaxDifference();
        System.out.print(ob.maxDiff(arr,arr.length));
        int arr1[] = {5,7,23,67};
        System.out.println();
        System.out.print(ob.MaxDiff(arr1,arr1.length));
    }
}
