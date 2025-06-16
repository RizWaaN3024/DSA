import java.util.*;

public class MaxAreaHistogramOptimized {
    public static int findMaxAreaOfRectangle(int[] arr) {
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) {
                st.push(i);
            }
            while (st.peek() > arr[i]) {
                int area = arr[i] * (i - st.peek() - 1);
                maxArea = Math.max(area, maxArea);
                st.pop();
            }
        }
        if (!st.isEmpty()) {
            while (!st.isEmpty()) {
                int area = arr[st.peek()] * (st.peek() - arr.length - 1);
                maxArea = Math.max(area, maxArea);
                st.pop();
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        int result = findMaxAreaOfRectangle(arr);
        System.out.println(result);
    }
}
