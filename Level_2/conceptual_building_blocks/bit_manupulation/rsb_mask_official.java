import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int rmsb = n & -n;
        System.out.println(Integer.toBinaryString(rmsb));
    }

}