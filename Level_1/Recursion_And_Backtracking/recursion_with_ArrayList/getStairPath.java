import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        } else if (n < 0) {
            ArrayList<String> base1 = new ArrayList<>();
            return base1;
        }
        
        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);
        
        ArrayList<String> ans = new ArrayList<>();
        for (String path: paths1) {
            ans.add(1 + path);
        }
        for (String path: paths2) {
            ans.add(2 + path);
        }
        for (String path: paths3) {
            ans.add(3 + path);
        }
        
        return ans;
    }

}