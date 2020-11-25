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
        int num = scn.nextInt();
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}