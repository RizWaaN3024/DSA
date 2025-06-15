import java.util.*;

public class MaxAreaHistogram {
    public class Pair {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    public int findMaxArea(int[] arr) 
    {

    }
    public List<Integer> findNearestSmallerLeft(int[] arr) {
        Stack<Pair> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int psuedoIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek().value > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                st.push(new Pair(0, psuedoIndex));
            } else {
                list.add(st.peek().index);
            }
            st.push(new Pair(arr[i], i));
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        findMaxArea(arr);
    }
}
