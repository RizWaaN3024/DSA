import java.util.*;

public class MaximalAreaApproach1 {
    public static int findMaximalRectArea(int[][] mat) {
        int m = mat[0].length;
        int n = mat.length;
        int arr[] = new int[m];
        for (int j = 0; j < m; j++) {
            arr[j] = mat[0][j];
        }
        int max = findMAH(arr);
    }
    public static int findMAH(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                int index = st.peek();
                int nse = i;
                st.pop();
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, (arr[index] * (nse - pse - 1)));
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int nse = arr.length;
            int index = st.peek();
            st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, (arr[index] * (nse - pse - 1)));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = { {0, 1, 1, 0},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 0}};
        int result = findMaximalRectArea(mat);
        System.out.println(result);
    }
}
