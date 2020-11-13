import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0);
        String roq = str.substring(1);
        ArrayList<String> recAns = gss(roq);
        
        ArrayList<String> mAns = new ArrayList<>();
        for (String e: recAns) {
            mAns.add(e);
        }
        
        for (String e: recAns) {
            mAns.add(ch + e);
        }
        
        return mAns;
    }

}