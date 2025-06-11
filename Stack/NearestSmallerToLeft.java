import java.util.*;

public class NearestSmallerToLeft {

    public static List<Integer> findNearestSmallerToLeft(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) {
                list.add(-1);
            } else if (!st.isEmpty() && st.peek() < arr[i]) {
                list.add(st.peek());
            } else if (!st.isEmpty() && st.peek() > arr[i]) {
                while (!st.isEmpty() && st.peek() > arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
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
        int arr[] = {2, 1, 3, 4, 5, 3};
        List<Integer> result = findNearestSmallerToLeft(arr);
        System.out.print(result);
    }
}
