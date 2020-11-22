import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        int nsp = n - 1;

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("" + '\t');
            }
            for (int cst = 1; cst <= nst; cst++) {
                if (cst == r) {
                    System.out.print("*" + '\t');
                }
            }
            nst++;
            nsp--;
            System.out.println();
        }
    }
}