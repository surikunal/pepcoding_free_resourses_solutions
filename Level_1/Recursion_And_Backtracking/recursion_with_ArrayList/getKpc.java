import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = getKPC(str);
        System.out.println(res);
    }
    
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        int ch = str.charAt(0) - '0';
        String roq = str.substring(1);
        ArrayList<String> recAns = getKPC(roq);
        ArrayList<String> mAns = new ArrayList<>();
        
        String code = codes[ch];
        for (int i = 0; i < code.length(); i++) {
            char chCode = code.charAt(i);
            for (String e: recAns) {
                mAns.add(chCode + e);
            }
        }
        return mAns;
    }
}