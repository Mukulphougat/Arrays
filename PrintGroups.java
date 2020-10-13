public class PrintGroups {
    void printGroups( int arr[], int n ){
        for( int i = 1 ; i < n ; i++ ){
            if( arr[i] != arr[i - 1]){
                if( arr[i] != arr[0] )
                    System.out.print("From "+i+" to ");
                else
                    System.out.print(i - 1+" ");
            }

        }
        System.out.println();
        if( arr[n - 1] != arr[0] )
            System.out.print(n - 1);
    }
    public static void main(String args[]){
        int arr[] = {0,0,1,1,0,0,0};
        PrintGroups ob = new PrintGroups();
        ob.printGroups(arr,arr.length);
    }
}
