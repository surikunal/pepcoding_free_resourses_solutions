import java.io.*;
import java.util.*;

// first approch ======================================================

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();    
        }
        int x = scn.nextInt();
        System.out.print(firstIndex(arr, 0, x));
    }
    
    public static int firstIndex(int[] arr, int idx, int x){
        if (idx == arr.length) {
            return -1;
        }
        
        int ans = firstIndex(arr, idx + 1, x);
        if (arr[idx] == x) {
            return idx;
        } else {
            return ans;
        }
    }
}

// second approch ======================================================

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();    
        }
        int x = scn.nextInt();
        System.out.print(firstIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if (idx == arr.length) {
            return -1;
        }
        
        if (arr[idx] == x) {
            return idx;
        } else {
            int ans = firstIndex(arr, idx + 1, x);
            return ans;
        }
    }
}