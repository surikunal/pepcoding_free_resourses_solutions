import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = 2 * n - 3;

        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cst + "\t");
            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            if (r == n) {
                nst--;
            }
            for (int cst = nst; cst >= 1; cst--) {
                System.out.print(cst + "\t");
            }
            nst++;
            nsp -= 2;
            System.out.println();
        }
    }
}