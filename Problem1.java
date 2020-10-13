public class Problem1 {
    boolean isSorted(int arr[]){                            // Naive solution with O(n) Time Complexity
        for( int i = 0 ; i < arr.length ; i++ ){
            for( int j = i + 1 ; j < arr.length ; j++ ){
                if( arr[j] < arr[i] )
                    return false;
            }
        }
        return true;
    }

    boolean IsSorted(int arr[]){                            // Sufficient Solution with O(n) Time Complexity
        for( int i = 1 ; i < arr.length ; i++ ){
            if( arr[i] < arr[i-1] )
                return false;
        }
        return true;
    }

    public static void main(String args[]){
        int arr[] = {8,12,15};
        Problem1 ob = new Problem1();
        System.out.println(ob.IsSorted(arr));
    }
}
