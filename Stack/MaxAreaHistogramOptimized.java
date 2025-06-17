import java.util.*;

public class MaxAreaHistogramOptimized {
    public static int findMaxAreaOfRectangle(int[] arr) {
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int index = st.peek();
                int nse = arr[i];
                st.pop();
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, (arr[index] * (nse - pse - 1)));
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int index = st.peek();
            int nse = arr[st.peek()];
            st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, (arr[index] * (nse - pse - 1)));
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
