import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int idx = 0;
            int min = arr[i][0];
            for (int j = 1; j < arr[0].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    idx = j;
                }
            }

            // System.out.println("idx  " + idx);
            // System.out.println("------");
            // System.out.println(min);

            int max = arr[i][idx];
            for (int in = 0; in < arr.length; in ++) {
                if (max < arr[ in ][idx]) {
                    max = arr[ in ][idx];
                }
            }
            // System.out.println(max);

            if (min == max) {
                System.out.println(max);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}