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
        
        ArrayList<String> ans = new ArrayList<>();
        for (int jump = 1; jump + sc <= dc; jump++) {
            ArrayList<String> hPaths = getMazePaths(sr, sc + jump, dr, dc);
            for (String hPath: hPaths) {
                ans.add("h" + jump + hPath);
            }
        }
        
        for (int jump = 1; jump + sr <= dr; jump++) {
            ArrayList<String> vPaths = getMazePaths(sr + jump, sc, dr, dc);
            for (String vPath: vPaths) {
                ans.add("v" + jump + vPath);
            }
        }
        
        for (int jump = 1; jump + sc <= dc && jump + sr <= dr; jump++) {
            ArrayList<String> dPaths = getMazePaths(sr + jump, sc + jump, dr, dc);
            for (String dPath: dPaths) {
                ans.add("d" + jump + dPath);
            }
        }
        return ans;
    }

}