import java.util.*;

public class InfixToPrefix {
    
    private static String convertInfixToPrefix(String s)
    {
        s = reverse(s);
        Stack<Character> st = new Stack<>();
        int i = 0;
        String result = "";
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                result += ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result += st.peek();
                    st.pop();
                }
                st.pop();
            } else {
                if (ch == '^') {
                    while (!st.isEmpty() && priority(st.peek()) >= priority(ch)) {
                        result += st.peek();
                        st.pop();
                    }
                } else {
                    while (!st.isEmpty() && priority(st.peek()) > priority(ch)) {
                        result += st.peek();
                        st.pop();
                    }
                }
                st.push(ch);
            }
            i++;
        }
        while (!st.isEmpty()) {
            result += st.peek();
            st.pop();
        }
        result = reverse(result);
        return result;
    }

    private static int priority(char ch)
    {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }

    private static String reverse(String s)
    {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                arr[i] = ')';
            } else if (arr[i] == ')') {
                arr[i] = '(';
            }
        }
        return new String(arr);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "(A+B)*C-D+F";

        System.out.println("The Infix expression is: " + s);
        String result = convertInfixToPrefix(s);
        System.out.println("The Prefix Expression is: "+ result);
    }
}
