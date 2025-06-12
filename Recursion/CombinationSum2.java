import java.util.*;

public class CombinationSum2 {
    public static List<List<Integer>> findCombSum (int[] arr, int target) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        Arrays.sort(arr);
        findUniqueComb(0, arr, target, ans, ds);
        return ans;
    }

    public static void findUniqueComb(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds)
    {
        if (target < 0) return;
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) continue;
            ds.add(arr[i]);
            findUniqueComb(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10,1,2,7,6,1,5 };
        int target = 8;

        List<List<Integer>> result = findCombSum(arr, target);
        System.out.println(result);
    }
}
