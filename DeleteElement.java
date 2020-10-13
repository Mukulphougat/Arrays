public class DeleteElement {
    int deleteElement( int arr[], int n, int x ){
        int i;
        for( i = 0 ; i < n ; i++ ) {
            if (arr[i] == x)
                break;
        }
        if (i == n )
            return n ;

        for (int j = i; j < n - 1; j++)
            arr[j] = arr[j + 1];
        return n - 1 ;
    }

    public static void main(String args[]){

        int n = 5 ;
        int arr[] = new int[n];
        arr[0] = 3;
        arr[1] = 8;
        arr[2] = 12;
        arr[3] = 5;
        arr[4] = 6;
        DeleteElement ob = new DeleteElement();
        int r = ob.deleteElement(arr,n,12);
        for( int i = 0 ; i < n ; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(r);
    }
}
