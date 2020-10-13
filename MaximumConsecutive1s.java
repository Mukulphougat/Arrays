public class MaximumConsecutive1s {
    int maxConsecutive(int arr[]){
        int res = 0 ;
        int n = arr.length;
        for( int i = 0 ; i < n ; i++ ){
            int curr = 0 ;
            for( int j = 0 ; j < n ; j++ ){
                if( arr[j] == 1 ) {
                    curr++;
                }
                else {
                    break;
                }
            }
            res = Math.max(curr,res);
        }
        return res;
    }

    int MaxConsecutive(int arr1[]){             // Sufficient Solution with O(n).
        int res = 0 , curr = 0 ;
        int n = arr1.length;
        for( int i = 0 ; i < n ; i++ ){
            if( arr1[i] == 0 ){
                curr = 0 ;
            }
            else{
                curr++;
                res = Math.max(res,curr);
            }
        }
        return res;
    }

    public static void main(String args[]){
        int arr1[] = {0,1,1,0,1,0};
        MaximumConsecutive1s ob = new MaximumConsecutive1s();
        int res = ob.MaxConsecutive(arr1);
        System.out.print(res);
    }
}
