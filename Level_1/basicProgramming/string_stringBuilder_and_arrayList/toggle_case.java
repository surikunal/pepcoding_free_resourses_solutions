import java.io.*;
import java.util.*;
public class Main {
	public static String toggleCase(String str){
	    StringBuilder sb = new StringBuilder(str);
		
		for ( int i = 0; i < str.length(); i++ ) {
		    char ch = str.charAt(i);
		    if ( ch >= 'a' && ch <= 'z' ) {
		        char ucl = (char)(ch - 'a' + 'A');
		        sb.setCharAt(i, ucl);
		    } else if ( ch >= 'A' && ch <= 'Z' ) {
		        char lcl = (char)(ch - 'A' + 'a');
		        sb.setCharAt(i, lcl);
		    }
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
}