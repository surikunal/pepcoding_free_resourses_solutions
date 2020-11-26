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
        int data = scn.nextInt();

        int l = 0;
        int h = n - 1;
        int ceil = 0;
        int floor = 0;
        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] < data) {
                l = mid + 1;
                floor = arr[mid];
            } else if (arr[mid] > data) {
                h = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}