import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int oz = 1;
        int oo = 1;
        
        for (int i = 2; i <= n; i++) {
            int nz = oo;
            int no = oo + oz;
            
            oz = nz;
            oo = no;
        }
        
        long ans = oz + oo;
        
        System.out.println( ans * ans );    // for both side
    }
}