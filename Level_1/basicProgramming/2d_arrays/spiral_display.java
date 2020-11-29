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
        
        int minr = 0;
        int minc = 0;
        int maxr = n - 1;
        int maxc = m - 1;
        int total = n * m;
        int count = 0;
        
        while (count < total) {
            for (int i = minr, j = minc; i <= maxr && count < total; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            
            for (int i = maxr, j = minc; j <= maxc && count < total; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            
            for (int i = maxr, j = maxc; i >= minr && count < total; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            
            for (int i = minr, j = maxc; j >= minc && count < total; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
            
        }
    }
}