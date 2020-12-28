import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] vals = new int[n];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = scn.nextInt();
        }
        
        int[] wts = new int[n];
        for (int i = 0; i < wts.length; i++) {
            wts[i] = scn.nextInt();
        }
        
        int tar = scn.nextInt();
        
        int[] dp = new int[tar + 1];
        dp[0] = 0;
        
        for (int cap = 1; cap <= tar; cap++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                if ( cap >= wts[i] ) {
                    int rcap = cap - wts[i];
                    int rval = dp[rcap];
                    int tval = vals[i] + rval;
                    
                    if (tval > max) {
                        max = tval;
                    }
                }
            }
            dp[cap] = max;
        }
        
        System.out.println( dp[tar] );
    }
}