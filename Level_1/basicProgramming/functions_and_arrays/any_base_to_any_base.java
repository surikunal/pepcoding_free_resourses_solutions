import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        
        int ans = function(n, sourceBase, destBase);
        System.out.println(ans);
    }
    
    public static int function(int n, int sb, int db) {
        int abtd = getValueIndecimal(n, sb);
        int dtab = getValueInBase(abtd, db);
        return dtab;
    }
    
    public static int getValueIndecimal(int n, int b) {
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;

            ans += rem * power;
            power = power * b;
        }
        return ans;
    }
    
    public static int getValueInBase(int n, int b) {
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int rem = n % b;
            n /= b;
            
            ans += rem * power;
            power *= 10;
        }
        return ans;
    }
}