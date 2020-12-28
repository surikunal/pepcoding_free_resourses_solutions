/* import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] zero = new int[n + 1];
        zero[1] = 1;
        int[] one = new int[n + 1];
        one[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            zero[i] = one[i - 1];
            one[i] = zero[i - 1] + one[i - 1];
        }
        
        System.out.println( zero[n] + one[n] );
    }
} */

//================================================================

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int oz = 1; // old zero
        int oo = 1; // old one
        
        for (int i = 2; i <= n; i++) {
            int nz = oo;    //new zero
            int no = oo + oz;   // new one
            
            oz = nz;
            oo = no;
        }
        
        System.out.println(oz + oo);
    }
}