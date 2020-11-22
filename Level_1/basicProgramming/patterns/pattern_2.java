import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = n;

        for (int r = 1; r <= n; r++) {
            for (int cst = nst; cst >= 1; cst--) {
                System.out.print("*" + '\t');
            }
            nst--;
            System.out.println();
        }

    }
}