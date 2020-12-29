import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int cpsf_r = 0;
        int leastsf = arr[0];
        int[] dp1 = new int[n];
        for (int i = 1; i < arr.length; i++) {
            if (leastsf > arr[i]) {
                leastsf = arr[i];
            }

            cpsf_r = arr[i] - leastsf;

            if (cpsf_r > dp1[i - 1]) {
                dp1[i] = cpsf_r;
            } else {
                dp1[i] = dp1[i - 1];
            }
        }

        int cspsf_l = 0;
        int maxsf = arr[n - 1];
        int[] dp2 = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (maxsf < arr[i]) {
                maxsf = arr[i];
            }

            cpsf_r = maxsf - arr[i];

            if (cpsf_r > dp2[i + 1]) {
                dp2[i] = cpsf_r;
            } else {
                dp2[i] = dp2[i + 1];
            }
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (dp1[i] + dp2[i] > ans) {
                ans = dp1[i] + dp2[i];
            }
        }

        System.out.println(ans);
    }
}