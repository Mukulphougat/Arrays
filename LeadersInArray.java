public class LeadersInArray {
    void Leader(int arr[], int n){              // Naive Solution with O(n*2) Time Complexity.
        for( int i = 0 ; i < n ; i++ ){
            boolean flag = false;
            for( int j = i + 1 ; j < n ; j++ ){
                if( arr[i] <= arr[j] )
                {
                    flag = true;
                    break;
                }
            }
            if( flag == false )
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

    void SufficientLeader(int arr1[], int n){    // Sufficient solution with O(n) time complexity.
        int currhead = arr1[n-1];
        System.out.print(currhead+" ");
        for( int i = n - 2 ; i >= 0 ; i-- ){
            if( currhead < arr1[i] )
            {
                currhead = arr1[i];
                System.out.print(currhead+" ");
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {7,10,4,3,6,5,2};
        LeadersInArray ob = new LeadersInArray();
        System.out.print("Naive Solution: ");
        ob.Leader(arr,arr.length);
        System.out.println();
        int arr1[] = {8,10,4,3,6,5,2};
        ob.SufficientLeader(arr1,arr1.length);
    }
}
