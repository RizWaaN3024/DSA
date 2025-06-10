/*
 * A brute force approach would be usinf two loops where the j loop is dependent on i loop 
 * Hence it can be optimised using a Stack data structure
 * Iterate from the rightmost element 
 * If the stack is empty add -1 to the result list
 * If the st.top() is not empty and  is greater than the current arr[i] add st.top() to the list
 * If the st.top() is not empty and it is smaller than the arr[i] then we run a while loop until our stack becomes empty or we encounter a greater element we keep popping elements from the stack
 * If our stack gets empty we add -1 to the result list
 * If out stack is not empty it means we have encountered a greater element hence we add it to our result list
 * And keep pushing elements to the stack 
 * And finally revrse the result before returning it
 * 
 */

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
        Collections.reverse(ds);
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
