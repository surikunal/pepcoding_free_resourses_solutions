import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n + 1];

        System.out.println(fibo(n, dp));
    }

    public static int fibo(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int a = fibo(n - 1, dp);
        int b = fibo(n - 2, dp);
        int sum = a + b;

        dp[n] = sum;

        return sum;
    }
}