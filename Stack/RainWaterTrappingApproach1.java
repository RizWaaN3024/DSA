import java.util.*;

public class RainWaterTrappingApproach1 {
    
    public static int findTrappedRainWater(int[] arr) {
        int length = arr.length;
        int mxl[] = new int[length];
        mxl[0] = arr[0];
        int mxr[] = new int[length];
        for (int i= 1; i < length; i++) {
            mxl[i] = Math.max(mxl[i - 1], arr[i]);
        }
        mxr[length - 1] = arr[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            mxr[i] = Math.max(mxr[i + 1], mxr[i]);
        }
        int water[] = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            water[i] = Math.min(mxl[i], mxr[i]) - arr[i];
            sum += water[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 3, 0, 0, 2, 0, 4};
        int result = findTrappedRainWater(arr);
        System.out.println(result);
    }
}
