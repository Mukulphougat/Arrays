public class ReverseAnArray {
    void Reverse( int arr[] ){                  // Time Complexity O(n)
        int low = 0 , high = arr.length - 1 ;
        while( low < high )
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String args[]){
        int arr[] = {10,5,7,30};
        ReverseAnArray Rev = new ReverseAnArray();
        Rev.Reverse(arr);
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
