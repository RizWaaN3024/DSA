import java.util.*;

public class NearestGreaterToRight {
    private static List<Integer> findNearestGreaterToRight(int[] arr)
    {
        Stack<Integer> st = new Stack<Integer>();
        ArrayList<Integer> ds = new ArrayList<Integer>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (st.size() == 0) {
                ds.add(-1);
            } else if (st.size() > 0 && st.peek() > arr[i]) {
                ds.add(st.peek());
            } else if (st.size() > 0 && st.peek() <= arr[i]) {
                while (st.size() > 0 && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    ds.add(-1);
                } else {
                    ds.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        return ds;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 2, 4};
        List<Integer> result = findNearestGreaterToRight(arr);
        System.out.println(result);
    }
}
