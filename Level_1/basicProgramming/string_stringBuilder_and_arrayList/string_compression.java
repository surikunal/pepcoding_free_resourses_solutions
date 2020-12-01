import java.io.*;
import java.util.*;
public class Main {
    public static String compression1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static String compression2(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int i = 1;
        int count = 0;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count != 0)
                    sb.append(count + 1);
                count = 0;
                sb.append(str.charAt(i));
            }
            i++;
        }

        if (count != 0) {
            sb.append(count + 1);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}