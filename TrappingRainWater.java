public class TrappingRainWater {
    int getWater(int arr[], int n){                 // Naive Solution with O(n ^ 2) time complexity.
        int res = 0 ;
        for( int i = 1 ; i < n ; i++ ){
            int lMax = arr[i];
            for( int j = 0 ; j < i ; j++ ) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for( int k = i + 1 ; k < n ; k++ ) {
                rMax = Math.max(rMax, arr[k]);
            }
            res += (Math.min(lMax,rMax)-arr[i]);
        }
        return res;
    }

    int GetWater(int arr1[], int n){
        int res = 0 ;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = arr1[0];
        for( int i = 1 ; i < n ; i++ )
            lmax[i] = Math.max(arr1[i],lmax[i-1]);

        rmax[n - 1] = arr1[n - 1];
        for( int i = n - 2 ; i >= 0 ; i-- )
            rmax[i] = Math.max(arr1[i],rmax[i+1]);

        for( int i = 1 ; i < n - 1 ; i++ )
            res = res + (Math.min(lmax[i],rmax[i]) - arr1[i]);

        return res;
    }

    int trappingWater(int arr[], int n) {
        int res = 0 ;
        int lmax = 0 ;
        int rmax = 0 ;
        int lo = 0 ;
        int hi = n - 1 ;
        while( lo <= hi ){
            if( arr[lo] < arr[hi] ){
                if( arr[lo] > lmax ){
                    lmax = arr[lo] ;
                }

                else{
                    res += lmax - arr[lo];
                    lo++;
                }
            }

            else{
                if( arr[hi] > rmax ){
                    rmax = arr[hi];
                }

                else{
                    res += rmax - arr[hi];
                    hi--;
                }
            }
        }
        return res;
    }

    public static void main(String args[]){
        int arr[] = {5,0,6,2,3};
        TrappingRainWater ob = new TrappingRainWater();
        int res = ob.getWater(arr,5);
        System.out.print(res);
        System.out.println();
        int arr1[] = {3,0,1,2,5};
        int res1 = ob.GetWater(arr1,arr1.length);
        System.out.print(res1);
        int arr2[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println();
        System.out.println(ob.trappingWater(arr2,arr2.length));
    }
}
