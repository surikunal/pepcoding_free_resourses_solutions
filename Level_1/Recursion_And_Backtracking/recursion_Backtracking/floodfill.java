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
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "", visited);
    }

    public static void floodfill(int[][] arr, int row, int col, String psf, boolean[][] visited){
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || arr[row][col] == 1 || visited[row][col] == true) {
            return;
        }

        if (row == arr.length - 1 && col == arr[0].length - 1) {
            System.out.println(psf);
            return;
        }
        
        visited[row][col] = true;
        floodfill(arr, row - 1, col, psf + "t", visited);
        floodfill(arr, row, col - 1, psf + "l", visited);
        floodfill(arr, row + 1, col, psf + "d", visited);
        floodfill(arr, row, col + 1, psf + "r", visited);
        visited[row][col] = false;
    }
}