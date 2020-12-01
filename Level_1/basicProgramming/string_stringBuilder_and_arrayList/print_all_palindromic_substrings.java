import java.io.*;
import java.util.*;
public class Main {
    public static void solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPalindrome(ss) == true) {
                    System.out.println(ss);
                }
            }
        }
    }
    
    public static boolean isPalindrome(String str) {
        int si = 0;
        int ei = str.length() - 1;
        while (si < ei) {
            if (str.charAt(si) == str.charAt(ei)) {
                si++;
                ei--;
            } else {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}