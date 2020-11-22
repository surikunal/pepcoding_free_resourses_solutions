import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        // point to note here is
        // if a (even sum of bnary string) - (odd sum of binary string) is divisible of 11 then then whole number is divisible of 3
        // because 11 is binary of 3
        
        // its a fact
        // for proof you can see the video
        // https://www.youtube.com/watch?v=Sd2ZjG20iUA&list=PL-Jc9J83PIiFJRioti3ZV7QabwoJK6eKe&index=26

        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < str.length(); i++) {
            int bit = str.charAt(i) - '0';
            if (i % 2 == 0) {
                even += bit;
            } else {
                odd += bit;
            }
        }
        int delta = even - odd;
        if (delta % 11 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}