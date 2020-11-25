import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int base, int n1, int n2) {
        int ans = 0;

        int carry = 0;
        int p = 1;
        while (n2 > 0) {
            int a = n2 % 10;
            n2 = n2 / 10;
            int b = n1 % 10;
            n1 = n1 / 10;

            int sub = 0;
            a = a + carry;
            if (a >= b) {
                carry = 0;
                sub = a - b;
            } else {
                carry = -1;
                sub = a - b + base;
            }
            ans += sub * p;
            p *= 10;
        }
        return ans;
    }
}