import java.util.*;

public class PrintFirstSubsequenceWithSumK {
    
    public static boolean printFirstSubsequence(int index, ArrayList<Integer> current, int[] arr, int sum, int k)
    {
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(current);
                return true;
            }
            return false;
        }

        // Take Part
        current.add(arr[index]);
        if (printFirstSubsequence(index + 1, current, arr, sum + arr[index], k) == true) {
            return true;
        }
        // not take part
        current.remove(current.size() - 1);
        if (printFirstSubsequence(index + 1, current, arr, sum, k) == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K");
        int k = sc.nextInt();

        int arr[] = {1, 2, 1};
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("The subsequence is:");
        printFirstSubsequence(0, list, arr, 0, k);
        sc.close();
    }
}
