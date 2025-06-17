import java.util.*;

public class NextGreaterII {

    public static List<Integer> findNextGreater(int arr[]) {
        Stack<Integer> st = new Stack<>();
        List<Integer> nge = new ArrayList<>();
        for (int i = ((2 * arr.length) - 1); i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i % arr.length]) {
                st.pop();
            }
            if (i < arr.length) {
                nge.add(st.isEmpty() ? -1 : st.peek());
            }
            st.push(arr[i % arr.length]);
        }
        Collections.reverse(nge);
        return nge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,3};
        List<Integer> result = findNextGreater(arr);
        System.out.println(result);
    }
}
