import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = n / 2;
        int nst = 1;

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            int val = 0;
            if (r <= n / 2) {
                val = r;
            } else {
                val = n - r + 1;
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");

                if (cst <= nst / 2) {
                    val++;
                } else {
                    val--;
                }
            }
            if (r <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }

    }
}