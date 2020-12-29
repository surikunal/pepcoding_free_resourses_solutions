import java.util.*;
public class rotate_a_number {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int k = scn.nextInt();
        int digit = 0;
        int temp = n;
        
        while (temp != 0) {
            digit++;
            temp /= 10;
        }
        
        k = k % digit;
        if (k < 0) {
            k = k + digit;
        }
        
        int mult = 1;
        int div = 1;
        for (int i = 1; i <= digit; i++) {
            if (i <= k) {
                mult *= 10;
            } else {
                div *= 10;
            }
        }
        int rem = n % mult;
        int oldVal = n / mult;
        
        n = rem * div + oldVal;
        
        System.out.println(n);
    } 
}