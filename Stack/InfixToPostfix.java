
import java.util.*;

public class InfixToPostfix {
    
    private static String converInfixToPostfix(String s)
    {
        int i = 0;
        Stack<Character> st = new Stack<>();
        String ans = "";

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                ans = ans + ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans = ans + st.peek();
                    st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                    ans = ans + st.peek();
                    st.pop();
                }
                st.push(ch);
            }
            i++;
        }
        while (!st.isEmpty()) {
            ans = ans + st.peek();
            st.pop();
        }
        return ans;
    }

    private static int priority(char c)
    {
        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = "a+b*(c^d-e)";
        System.out.println("The Infix expression is: " + s);
        String result = converInfixToPostfix(s);
        System.out.println("The PostFix expression after conversion is:" + result);
    }
}
