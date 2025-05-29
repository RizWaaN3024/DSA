package Recursion;
import java.util.*;

public class ReverseArray {
    public static int reverse(int n, int a[]) {
        if (n == 0) {
            return 0;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        reverse(n, a);
    }
}
