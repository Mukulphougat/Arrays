public class InsertElement {
    public int insert(int arr[], int n , int x , int pos){
        if( n == arr.length )
            return n;
        int index = pos - 1 ;

        for( int i = n - 1 ; i >= index ; i-- ) {
            arr[i + 1] = arr[i];
        }

        arr[index] = x;

        return n + 1;
    }

    public static void main(String args[]){
        int arr[] = new int[7];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        InsertElement n = new InsertElement();
        int res = n.insert(arr,4,7,2);
        System.out.print(res);
        System.out.println();
        for( int i = 0 ; i < arr.length ; i++ )
            System.out.print(arr[i]+" ");
    }
}
