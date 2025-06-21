import java.util.*;

public class SumOfSubarrayMaximums {
    
    public static int findSumOfSubarrayMaximums(int[] arr) {
        int n = arr.length;
        int[] nge = findNGE(arr);
        int[] pge = findPGE(arr);
        int total = 0;
        int mod = (int)(1e9 + 7);
        for (int i = 0; i < n; i++) {
            int left = i - pge[i];
            int right = nge[i] - i;
            long contributions = ((long) left * right * arr[i]) % mod;
            total += (int)contributions;
        }
        return total;
    }

    public static int[] findNGE(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int result[] = new int[n];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = n;
            } else {
                result[i] = st.peek();
            }
            st.push(i);
        }
        return result;
    }

    public static int[] findPGE(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int result[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3};
        int result = findSumOfSubarrayMaximums(arr);
        System.out.println(result);
    }
}
