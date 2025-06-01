import java.util.*;

public class CountNumberOsSubseqWithSumK {
    public static int countNumberOfSubseq(int index, int[] arr, int sum, int k)
    {
        if (index == arr.length) {
            if (sum == k) {
                return 1;
            } 
            return 0;
        }

        // Take part
        int left = countNumberOfSubseq(index + 1, arr, sum + arr[index], k);

        // not take part
        int right = countNumberOfSubseq(index + 1, arr, sum, k);

        return left + right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the calue of K: ");
        int k = sc.nextInt();

        int arr[] = {1, 2, 1};

        System.out.println("The count of subsequence with sum equal to K: " + countNumberOfSubseq(0, arr, 0, k));
    }
}
