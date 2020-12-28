import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // int ans = climbingStairs(n);
        // int ans = climbingStairsMemo(n, new int[n + 1]);
        int ans = climbingStairsTabu(n);
        System.out.println(ans);
    }
    
    public static int climbingStairs(int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            return 0;
        }
        
        int one = climbingStairs(n - 1);
        int two = climbingStairs(n - 2);
        int three = climbingStairs(n - 3);
        
        return one + two + three;
    }
    
    public static int climbingStairsMemo(int n, int[] dp) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            return 0;
        }
        
        if (dp[n] != 0) {
            return dp[n];
        }
        
        int one = climbingStairsMemo(n - 1, dp);
        int two = climbingStairsMemo(n - 2, dp);
        int three = climbingStairsMemo(n - 3, dp);
        
        dp[n] = one + two + three;
        return one + two + three;
    }
    
    public static int climbingStairsTabu(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            if (i >= 2) {
                dp[i] += dp[i - 2];
            }
            if (i >= 3) {
                dp[i] += dp[i - 3];
            }
        }
        return dp[n];
    }
}