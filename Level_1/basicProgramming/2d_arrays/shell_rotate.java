import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();
        shellRotate(arr, s, r);
        display(arr);
    }

    public static void shellRotate(int[][] arr, int s, int r) {
        int[] oneD = shellToOneD(arr, s);
        rotate(oneD, r);
        oneDToShell(arr, s, oneD);
    }

    public static int[] shellToOneD(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int size = 2 * (maxc - minc + maxr - minr);
        int[] oneD = new int[size];

        int idx = 0;
        for (int i = minr, j = minc; j <= maxc; j++) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        for (int i = minr + 1, j = maxc; i <= maxr; i++) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        for (int i = maxr, j = maxc - 1; j >= minc; j--) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        for (int i = maxr - 1, j = minc; i >= minr + 1; i--) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        
        return oneD;
    }

    public static void rotate(int[] arr, int r) {
        r = r % arr.length;
        if (r < 0) {
            r += arr.length;
        }

        reverse(arr, 0, r - 1);
        reverse(arr, r, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int si, int ei) {
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }
    }

    public static void oneDToShell(int[][] arr, int s, int[] oneD) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;
        for (int i = minr, j = minc; j <= maxc; j++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = minr + 1, j = maxc; i <= maxr; i++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = maxr, j = maxc - 1; j >= minc; j--) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = maxr - 1, j = minc; i >= minr + 1; i--) {
            arr[i][j] = oneD[idx];
            idx++;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}