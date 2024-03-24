package Arrays.Arrays1d;

import java.util.Scanner;

public class BuySellStocks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of stocks: ");
        int n = sc.nextInt();
        int[] stocks = new int[n];
        System.out.println("Enter the stock price: ");
        for(int i = 0; i<n; i++){
            stocks[i] = sc.nextInt();
        }

        stockPrice(stocks);
    }

    public static void stockPrice(int[] stocks){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<stocks.length; i++){
            if(buyPrice<stocks[i]){
                int profit = stocks[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = stocks[i];
            }
        }
        System.out.println("Maximum Profit: "+maxProfit);
        
    }
}
