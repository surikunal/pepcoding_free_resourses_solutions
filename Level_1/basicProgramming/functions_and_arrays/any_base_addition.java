import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int base, int n1, int n2) {
        int ans = 0;
        int p = 1;
        int carry = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int a = n1 % 10;
            int b = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = (a + b + carry);

            if (sum >= base) {
                carry = sum / base;
            } else {
                carry = 0;
            }
            sum = sum % base;
            // carry = sum / base;
            // sum = sum % base;

            ans += sum * p;
            p *= 10;
        }
        return ans;
    }
}