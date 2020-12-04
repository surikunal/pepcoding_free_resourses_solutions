import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for (int i = low; i <= high; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int val) {
        for (int i = 2; i * i <= val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}