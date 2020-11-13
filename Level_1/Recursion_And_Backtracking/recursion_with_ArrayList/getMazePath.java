import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        ArrayList<String> ans = getMazePaths(1, 1, r, c);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> vPaths = new ArrayList<>();
        ArrayList<String> hPaths = new ArrayList<>();
        
        if (sr < dr) {
            vPaths = getMazePaths(sr + 1, sc, dr, dc);
        }
        if (sc < dc) {
            hPaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        for (String hPath: hPaths) {
            paths.add("h" + hPath);
        }
        for (String vPath: vPaths) {
            paths.add("v" + vPath);
        }
        return paths;
    }

}