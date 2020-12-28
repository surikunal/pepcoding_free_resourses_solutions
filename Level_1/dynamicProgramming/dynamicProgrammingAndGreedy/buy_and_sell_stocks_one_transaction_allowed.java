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

        int lsf = Integer.MAX_VALUE;
        int currentProfit = 0;
        int overallProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }

            currentProfit = prices[i] - lsf;
            if (currentProfit > overallProfit) {
                overallProfit = currentProfit;
            }
        }

        System.out.println(overallProfit);
    }
}