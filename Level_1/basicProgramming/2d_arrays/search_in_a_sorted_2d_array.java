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
        
        int val = scn.nextInt();
        
        int i = 0;
        int j = arr.length - 1;
        
        while (j >= 0 && i < arr.length) {
            if (arr[i][j] == val) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (arr[i][j] < val) {
                i++;
            } else {
                j--;
            }
        }
        
        System.out.println("Not Found");
    }
}