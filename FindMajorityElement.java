public class FindMajorityElement {
    int findMajority( int arr[], int n ){
        int res = 0 , count = 1 ;
        for( int i = 1 ; i < n ; i++ ){
            if( arr[res] == arr[i] )
                count++;
            else
                count--;
            if( count == 0 ){
                res = i ;
                count = 1;
            }
        }
        count = 0 ;
        for( int i = 0 ; i < n ; i++ ) {
            if (arr[res] == arr[i])
                count++;
        }
        if( count <= n/2 )
            res = -1;
        return arr[res];
    }

    public static void main(String args[]){
        int arr[] = {8,7,6,6,6,6};
        FindMajorityElement ob = new FindMajorityElement();
        int res = ob.findMajority(arr,arr.length);
        System.out.print(res);
    }
}
