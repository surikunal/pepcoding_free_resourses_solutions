/* import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[][] arr = new int[2][n];
        arr[1][0] = k;
        arr[1][1] = k * (k - 1);
        int total = arr[1][0] + arr[1][1];
        for (int i = 2; i < n; i++) {
            arr[0][i] = arr[1][i - 1];
            arr[1][i] = total * (k - 1);
            total = arr[0][i] + arr[1][i];
        }

        System.out.println(total);
    }
} */

// ================ NOW WITHOUT USING SPACE

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int ii = k;
        int ij = k * (k - 1);
        int total = ii + ij;

        for (int i = 2; i < n; i++) {
            int nii = ij;
            int nij = total * (k - 1);
            total = nij + nii;

            ii = nii;
            ij = nij;
        }

        System.out.println(total);
    }
}