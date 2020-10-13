public class ContainerWithMostWater {
    int MaxWater( int arr[] , int n ){
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = n - 1;
        while( i < j ){
            int min = Math.min(arr[i],arr[j]);
            max = Math.max(max, min * (j - i - 1));
            if( arr[i] < arr[j] ){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }

    public static void main(String args[]){
        int arr[] = {1,3,4};
        ContainerWithMostWater ob = new ContainerWithMostWater();
        System.out.println(ob.MaxWater(arr,arr.length));
    }
}
