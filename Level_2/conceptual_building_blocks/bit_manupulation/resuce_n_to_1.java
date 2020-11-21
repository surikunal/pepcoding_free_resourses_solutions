import java.io.*;
import java.util.*;

public class Main {

    public static int solution(long n) {
        // --------------------- video has a great concept to revise again
        int res = 0;
        while (n != 1) {
            if (n % 2 == 0) { // even
                n = n / 2;
            } else if (n == 3) { // exception of (4x + 3) type
                res = 2;
                break;
            } else if ((n & 3) == 1) { // (4x + 1) type
                n = n - 1;
            } else if ((n & 3) == 3) { // (4x + 3) type
                n = n + 1;
            }
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
    }
}