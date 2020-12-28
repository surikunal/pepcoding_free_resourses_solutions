import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }
        int[] wts = new int[n];
        for (int i = 0; i < n; i++) {
            wts[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        int[][] dp = new int[n + 1][tar + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wts[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    int rWts = j - wts[i - 1];
                    
                    if ( dp[i - 1][j] > vals[i - 1] + dp[i - 1][rWts] ) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = vals[i - 1] + dp[i - 1][rWts];
                    }
                }
            }
        }
        
        System.out.println( dp[n][tar] );
    }
}