import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int n1_ = n1;
        int n2_ = n2;
        while (n1_ % n2_ != 0) {
            int rem = n1_ % n2_;
            n1_ = n2_;
            n2_ = rem;
        }
        int gcd = n2_;
        int lcm = (n1 * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}