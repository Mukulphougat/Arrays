public class BuyAndSell {
    int maxProfit(int price[], int start, int end){
        if( end <= start )
            return 0;

        int profit = 0 ;
        for( int i = start ; i < end ; i++ ){
            for( int j = i + 1 ; j <= end ; j++ ){
                if( price[j] > price[i] ) {
                    int cProfit = (price[j] - price[i]) + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
                    profit = Math.max(profit,cProfit);
                }
            }
        }
        return profit;
    }

    int MaxProfit(int price1[], int n){
        int profit = 0 ;
        for( int i = 1 ; i < n ; i++ ){
            if( price1[i] > price1[i - 1] ){
                profit += (price1[i] - price1[i - 1]);
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int price[] = {1,5,3,8,12};
        BuyAndSell ob = new BuyAndSell();
        int res = ob.maxProfit(price,0,4);
        System.out.println(res);
        int price1[] = {30,20,10};
        int result = ob.MaxProfit(price1,3);
        System.out.println(result);
    }
}
