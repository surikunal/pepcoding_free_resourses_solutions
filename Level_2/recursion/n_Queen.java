import java.io.*;
import java.util.*;

public class n_Queen {

    public static void solve(boolean[][] board, int row, boolean[] cols, boolean[] ndiags, boolean[] rdiags, String asf) {
        if (row == board.length) {
            System.out.println(asf + ".");
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (cols[col] == false && ndiags[col + row] == false && rdiags[row - col + board.length - 1] == false) {
                board[row][col] = true;
                cols[col] = true;
                ndiags[col + row] = true;
                rdiags[row - col + board.length - 1] = true;
                solve(board, row + 1, cols, ndiags, rdiags, asf + row + "-" + col + ", ");
                cols[col] = false;
                ndiags[col + row] = false;
                rdiags[row - col + board.length - 1] = false;
                board[row][col] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] board = new boolean[n][n];
        
        boolean[] cols = new boolean[n];
        boolean[] ndiags = new boolean[2 * n - 1];
        boolean[] rdiags = new boolean[2 * n - 1];

        solve(board, 0, cols, ndiags, rdiags, "");
    }

}