public class SearchElement {
    void search(int arr[], int n, int x){
        for( int i = 0 ; i < n ; i++ ) {
            if (arr[i] == x)
                System.out.print("We found " + x + " at " + i + ".");
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        SearchElement n = new SearchElement();

        n.search(arr,8,7);
    }
}
