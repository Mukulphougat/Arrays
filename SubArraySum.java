public class SubArraySum {
    boolean isSubSum( int arr[] , int n , int sum ){
        int curr_sum = arr[0], s = 0 ;
        for( int e = 1 ; e < n ; e++ ){
            while( curr_sum > sum && s < e - 1 ){
                curr_sum -= arr[s];
                s++;
            }
            if( curr_sum == sum ){
                return true;
            }
            if( e < n ){
                curr_sum += arr[e];
            }
        }
        return (curr_sum == sum);
    }
    public static void main(String args[]){
        int arr[] = {1,4,20,2};
        SubArraySum ob = new SubArraySum();
        boolean r = ob.isSubSum(arr,arr.length,24);
        System.out.print(r);
    }
}
