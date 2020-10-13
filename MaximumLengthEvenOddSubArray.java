import com.sun.deploy.security.SelectableSecurityManager;

public class MaximumLengthEvenOddSubArray {             // Naive Solution with O(n ^ 2) time complexity.
    int maxEvenOdd(int arr1[], int n){
        int res = 1;
        for( int i = 0 ; i < n ; i++ ){
            int curr = 1 ;
            for( int j = i + 1 ; j < n ; j++ ){
                if((arr1[j] % 2 == 0 && arr1[j - 1] % 2 == 0 ) || (arr1[j] % 2 != 0 && arr1[j - 1] % 2 != 0)){
                    curr++;
                }
                else {
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        return res;
    }

    int MaxEvenOdd(int arr[], int n){               // Efficient Solution using kadane's algorithm with O(n) time complexity.
        int res = 1 ;
        int curr = 1 ;
        for( int i = 1 ; i < n ; i++ ){
            if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0 ) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
            {
                curr++;
                res = Math.max(res,curr);
            }
            else {
                curr = 1;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr1[] = {10,12,14,7,8};
        MaximumLengthEvenOddSubArray ob = new MaximumLengthEvenOddSubArray();
        int r = ob.maxEvenOdd(arr1,arr1.length);
        System.out.print(r);
        System.out.println();
        int arrs[] = {2,3,6,9,25,67};
        int r1 = ob.MaxEvenOdd(arrs,arrs.length);
        System.out.print(r1);
    }
}
