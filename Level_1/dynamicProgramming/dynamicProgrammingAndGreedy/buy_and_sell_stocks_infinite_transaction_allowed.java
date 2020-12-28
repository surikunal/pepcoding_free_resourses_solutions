import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scn.nextInt();
        }
        
        int sellDate = 0;
        int buyDate = 0;
        int profit = 0;
        
        for ( int i = 1; i < prices.length; i++ ) {
            if ( prices[i] >= prices[i - 1] ) {
                sellDate++;
            } else {
                profit += prices[sellDate] - prices[buyDate];
                sellDate = buyDate = i;
            }
        }
        
        profit += prices[sellDate] - prices[buyDate];
        System.out.println(profit);
    }
}