import java.util.*;

public class PrintSubsequencesWithSumK {
    
    private static void PrintSubsequencesWithSumEqualToK(int index, ArrayList<Integer> current, int[] arr, int sum, int k)
    {
        if (index == arr.length) {
            if (k == sum) {
                System.out.println(current);
            }
            return;
        }
        // Take part
        current.add(arr[index]);
        PrintSubsequencesWithSumEqualToK(index + 1, current, arr, sum + arr[index], k);

        // Not take part
        current.remove(current.size() - 1);
        PrintSubsequencesWithSumEqualToK(index + 1, current, arr, sum, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 1};
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();
        System.out.println("The Subsequences with sum K are: ");
        PrintSubsequencesWithSumEqualToK(0, list, arr, sum, k);
    }
}
