import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = scn.nextInt();
        int j = scn.nextInt();
        int k = scn.nextInt();
        int m = scn.nextInt();

        System.out.println((n | (1 << i)));
        System.out.println((n & (~(1 << j))));
        System.out.println((n ^ (1 << k)));
        if (((n & (1 << m)) == 0)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

}