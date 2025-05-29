package Recursion;
import java.util.*;

public class ReverseArray {
    public static void reverse(int l, int r, int a[]) {
        if (l == r) {
            return;
        }
        swap(a, l, r);
        reverse(l + 1, r - 1, a);
    }
    public static void swap(int a[], int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array values");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(a));
        reverse(0, n - 1, a);
        System.out.println("Reversed Array: " + Arrays.toString(a));
        sc.close();
    }
}
