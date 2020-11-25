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

        int ans = span(arr);
        System.out.println(ans);
    }

    public static int span(int[] arr) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
            }
            if (maxi < arr[i]) {
                maxi = arr[i];
            }
        }
        return (maxi - mini);
    }
}