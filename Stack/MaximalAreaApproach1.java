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
