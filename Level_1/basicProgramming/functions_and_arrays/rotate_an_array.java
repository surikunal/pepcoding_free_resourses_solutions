import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        k = k < 0 ? k + a.length : k;
        k = a.length - k;
        revrese(a, 0, k - 1);
        revrese(a, k, a.length - 1);
        revrese(a, 0, a.length - 1);
    }

    public static void revrese(int[] a, int si, int ei) {
        while (si < ei) {
            int temp = a[si];
            a[si] = a[ei];
            a[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }
}