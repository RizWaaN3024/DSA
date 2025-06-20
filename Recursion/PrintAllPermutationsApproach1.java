import java.util.*;

public class PrintAllPermutationsApproach1 {
    public static List<List<Integer>> printAllPermutations(int arr[]) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];
        printPermutations(arr, freq, ans, ds);
        return ans;
    }

    public static void printPermutations(int[] arr, boolean[] freq, List<List<Integer>> ans, List<Integer> ds) {
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                printPermutations(arr, freq, ans, ds);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3 };
        List<List<Integer>> ans =  printAllPermutations(arr);
        System.out.println("The possible permutations are:");
        System.out.println(ans);
    }
}
