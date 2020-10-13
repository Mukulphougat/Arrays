public class MaximumSubArraySum {
    int maxSum(int arr[], int n){
        int res = arr[0];
        for( int i = 0 ; i < n ; i++ ){
            int curr =  i ;
            for( int j = 0 ; j < n ; j++ ){
                curr = curr + arr[j];
                res = Math.max(res,curr);
            }
        }
        return res;
    }

    int MaxSum(int arr1[], int n){          // Efficient Solution with O(n) time Complexity using kadane's algorithm.
        int res = arr1[0];
        int maxEnding = arr1[0];
        for( int i = 1 ; i < n ; i++ ){
            maxEnding = Math.max(maxEnding + arr1[i],arr1[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String args[]){
        int arr1[] = {2,3,-8,7,-1,2,3};
        MaximumSubArraySum ob = new MaximumSubArraySum();
        int r = ob.MaxSum(arr1,arr1.length);
        System.out.print(r);
    }
}
