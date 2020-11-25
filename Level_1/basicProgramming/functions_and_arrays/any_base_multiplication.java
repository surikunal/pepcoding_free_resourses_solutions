import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int ans = 0;
        
        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            
            int singleValue = porductWithOneDigit(b, n1, d2);
            ans = getSum(b, ans, singleValue * p);
            p *= 10;
        }
        
        return ans;
    }
    
    public static int porductWithOneDigit(int b, int n1, int d2) {
        int ans = 0;
        int carry = 0;
        int p = 1;
        while (n1 > 0 || carry > 0) {
            int a = n1 % 10;
            n1 = n1 / 10;
            
            int prod = d2 * a + carry;
            
            carry = prod / b;
            prod = prod % b;
            
            ans = ans + prod * p;
            p = p * 10;
        }
        
        return ans;
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