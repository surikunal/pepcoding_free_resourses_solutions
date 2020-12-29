import java.util.*;
public class reverse_a_number {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();

        while (n != 0) {
            int r = n % 10;
            System.out.println(r);
            
            n = n / 10;
        }
    }
}