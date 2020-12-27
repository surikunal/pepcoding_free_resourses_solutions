//============================   N^3 complexicity

/* import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[n][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][c];
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = arr[0][j];
        }
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0 ; j < dp[0].length; j++) {
                
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < dp[0].length; k++) {
                    if (k != j) {
                        min = Math.min(dp[i - 1][k] , min);
                    }
                }
                
                dp[i][j] = min + arr[i][j];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < dp[0].length; j++) {
            min = Math.min(min, dp[dp.length - 1][j]);
        }
        System.out.println(min);
    }
} */

//================================================================

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[n][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[arr.length][arr[0].length];

        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = arr[0][j];

            if (arr[0][j] <= least) {
                sleast = least;
                least = arr[0][j];
            } else if (arr[0][j] <= sleast) {
                sleast = arr[0][j];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            for (int j = 0; j < dp[0].length; j++) {
                if (least == dp[i - 1][j]) {
                    dp[i][j] = sleast + arr[i][j];
                } else {
                    dp[i][j] = least + arr[i][j];
                }

                if (dp[i][j] <= nleast) {
                    nsleast = nleast;
                    nleast = dp[i][j];
                } else if (dp[i][j] <= nsleast) {
                    nsleast = dp[i][j];
                }
            }

            least = nleast;
            sleast = nsleast;
        }
        System.out.println(least);
    }
}