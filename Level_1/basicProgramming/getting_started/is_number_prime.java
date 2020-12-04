import java.util.*;
public class is_number_prime {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        
        for (int i = 0; i < n; i++) {
            int data = scn.nextInt();
            
            if (isPrime(data) == true) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
    
    public static boolean isPrime(int val) {
        for (int i = 2; i * i <= val; i++) {
            if (val % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}