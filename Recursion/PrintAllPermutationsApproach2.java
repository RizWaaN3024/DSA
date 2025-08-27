import java.util.*;

public class PrintAllPermutationsApproach2 {

    public static List<List<Integer>> printAllPermutations(int arr[]) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, arr, ans);
        return ans;
    }

    public static void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }

    public static void swap(int i, int index, int[] nums) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = { 1, 2, 3 };
        List<List<Integer>> ans = printAllPermutations(nums);
        System.out.println(ans);
    }
}
