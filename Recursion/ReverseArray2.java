package Recursion;
import java.util.*;

public class ReverseArray2 {
    private static void reverse(int i, int arr[]) {
        int n = arr.length;
        if (i >= n/2) {
            return;
        }
        swap(arr, i, n - i - 1);
        reverse(i + 1, arr);
    }

    private static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:"+ Arrays.toString(arr));
        reverse(0, arr);
        System.out.print("Array after reversing"+ Arrays.toString(arr));
        sc.close();
    }
}
