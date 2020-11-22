import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("" + '\t');
            }
            for (int cst = nst; cst >= 1; cst--) {
                System.out.print("*" + '\t');
            }
            nsp++;
            nst--;
            System.out.println();
        }

    }
}