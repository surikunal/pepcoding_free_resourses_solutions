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

        int fee = scn.nextInt();

        int obsp = -prices[0];
        int ossp = 0;
        for (int i = 1; i < prices.length; i++) {
            int nbsp = 0;
            int nssp = 0;
            if (-prices[i] + ossp > obsp) {
                nbsp = ossp - prices[i];
            } else {
                nbsp = obsp;
            }

            if (prices[i] + obsp - fee > ossp) {
                nssp = prices[i] + obsp - fee;
            } else {
                nssp = ossp;
            }

            ossp = nssp;
            obsp = nbsp;
        }

        System.out.println(ossp);
    }
}