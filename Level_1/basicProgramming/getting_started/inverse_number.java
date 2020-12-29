import java.util.*;
public class inverse_number {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();

        int ans = 0;
        int op = 1;
        while (n != 0) {
            int od = n % 10;
            int id = op;
            int ip = od;

            ans += id * (int) Math.pow(10, ip - 1);

            n = n / 10;
            op++;
        }
        System.out.println(ans);
    }
}