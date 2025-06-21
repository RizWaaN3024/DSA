import java.util.*;

public class SumOfSubarrayMaximums {
    
    public static int findSumOfSubarrayMaximums(int[] arr) {
        int n = arr.length;
        int[] nge = findNGE(arr);
        int[] pge = findPGE(arr);
        int total = 0;
        int mod = (int)(1e9 + 7);
        for (int i = 0; i < arr.length; i++) {
            int left = i - pge[i];
            int right = nge[i] - i;
            long contributions = ((long) left * right * arr[i]) % mod;
            total += (int)contributions;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 1, 2, 4};
        int result = findSumOfSubarrayMaximums(arr);
        System.out.println(result);
    }
}
