import java.util.*;

public class RemoveKDigits {

    public static String removeKDigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        if (k == num.length()) {
            return "0";
        }
        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && k > 0 && st.peek() - '0' > num.charAt(i) - '0') {
                st.pop();
                k -= 1;
            }
            if (!st.isEmpty() || num.charAt(i) != '0')
            st.push(num.charAt(i));
        }
        if (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }
        if (st.isEmpty()) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = "1432219";
        int k = 3;
        String result = removeKDigits(num, k);
        System.out.println(result);
    }   
}
