import java.util.*;

public class MaxAreaHistogram {
    public static class Pair {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    public static int findMaxArea(int[] arr)
    {
        List<Integer> right = findNearestSmallerRight(arr);
        List<Integer> left = findNearestSmallerLeft(arr);
        List<Integer> width = new ArrayList<>();
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            width.add(right.get(i) - left.get(i) - 1);
        }
        List<Integer> area = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            area.add(width.get(i) * arr[i]);
            maxArea = Math.max(area.get(i), maxArea);
        }
        return maxArea;
    }
    public static List<Integer> findNearestSmallerRight(int[] arr) {
        Stack<Pair> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int psuedoIndex = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek().value > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                list.add(psuedoIndex);
            } else {
                list.add(st.peek().index);
            }
            st.push(new Pair(arr[i], i));
        }
        Collections.reverse(list);
        return list;
    }

    public static List<Integer> findNearestSmallerLeft(int[] arr) {
        Stack<Pair> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int psuedoIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek().value > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                list.add(psuedoIndex);
            } else {
                list.add(st.peek().index);
            }
            st.push(new Pair(arr[i], i));
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        int result = findMaxArea(arr);
        System.out.println(result);
    }
}
