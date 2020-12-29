import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        int[][] dp = new int[k + 1][n];
        for (int i = 1; i < dp.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j < dp[0].length; j++) {
                if (dp[i - 1][j - 1] - arr[j - 1] > max) {
                    max = dp[i - 1][j - 1] - arr[j - 1];
                }

                if (max + arr[j] > dp[i][j - 1]) {
                    dp[i][j] = max + arr[j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        System.out.println(dp[k][n - 1]);
    }
}