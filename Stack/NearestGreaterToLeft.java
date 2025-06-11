import java.util.*;

public class NearestGreaterToLeft {
    private static List<Integer> findNearestGreaterToLeft(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0) {
                list.add(-1);
            } else if (st.size() > 0 && st.peek() > arr[i]) {
                list.add(st.peek());
            } else if (st.size() > 0 && st.peek() <= arr[i]) {
                while (st.size() > 0 && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    list.add(-1);
                } else {
                    list.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        return list;
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 2, 4};
        List<Integer> result = findNearestGreaterToLeft(arr);
        System.out.println(result);
    }
}
