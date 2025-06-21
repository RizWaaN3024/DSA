import java.util.*;

public class SumOfSubarrayMinimums {
    
    public static int findSumOfSubarrayMinimums(int[] arr) {
        int n = arr.length;
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        int total = 0;
        int mod = (int)(1e9 + 7);
        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            long contribution = ((long)left * right * arr[i]) % mod;
            total = total + (int)contribution;
        }
        return total;
    }

    public static int[] findNSE(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int result[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = arr.length;
            } else {
                result[i] = st.peek();
            }
            st.push(i);
        }
        return result;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 1, 2, 4};
    }
}
