import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str, "");
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};   
    public static void printKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        int ch = str.charAt(0) - '0';
        String roq = str.substring(1);
        
        String code = codes[ch];
        for (int i = 0; i < code.length(); i++) {
            char cho = code.charAt(i);
            printKPC(roq, ans + cho);
        }
    }
}