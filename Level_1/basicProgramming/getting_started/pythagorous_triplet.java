import java.util.*;

public class pythagorous_triplet {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if ((a*a == b*b + c*c) || (a*a == b*b - c*c) || (a*a == c*c - b*b)) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}