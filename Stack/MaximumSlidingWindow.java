import java.util.*;

public class MaximumSlidingWindow {

    public static int[] findMaximumSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[n - k + 1];
        int resultIndex = 0;
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            if (i >= k - 1) {
                result[resultIndex++] = arr[dq.peekFirst()]; 
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 4, 2, 3, 5, 7, 6, -2 };
        int k = 3;
        int result[] = findMaximumSlidingWindow(arr, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
