public class RemoveDuplicates {
    int RemDups( int arr[] ){                   // Naive solution with O(n) time complexity.
        int temp[] = new int[arr.length];       // and space complexity O(n)
        temp[0] = arr[0];
        int res = 1 ;
        for( int i = 1 ; i < arr.length ; i++ ){
            if(temp[res - 1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }

        for( int i = 0 ; i < arr.length ; i++ )
            arr[i] = temp[i];

        return res;
    }

    int RemoveDuplicates(int arr[]){            // Sufficient Solution with O(n) time and O(1) space complexity.
        int res = 1 ;
        for( int i = 1 ; i < arr.length ; i++ ){
            if( arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String args[]){
        int arr[] = {10,20,20,30,30,30,40,40};
        RemoveDuplicates ob = new RemoveDuplicates();
        int R1 = ob.RemoveDuplicates(arr) ;
        for( int i = 0 ; i < R1 ; i++ )
            System.out.print(arr[i]+" ");

    }
}
