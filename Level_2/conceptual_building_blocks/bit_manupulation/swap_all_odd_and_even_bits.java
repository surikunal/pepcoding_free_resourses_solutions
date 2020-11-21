import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int en = 0xAAAAAAAA;
        int on = 0x55555555;

        int odd = n & on;
        int even = n & en;

        odd = (odd << 1);
        even = (even >> 1);

        System.out.println((odd | even));
    }

}