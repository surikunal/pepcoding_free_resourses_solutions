import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int val_1 = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val_1 + "\t");
                int val_2 = val_1 * (i - j) / (j + 1);
                val_1 = val_2;
            }
            System.out.println();
        }
    }
}