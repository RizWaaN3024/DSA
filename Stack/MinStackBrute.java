import java.util.*;

public class MinStackBrute {
    
    public class Pair {
        int value;
        int minValue;

        public Pair(int value, int minValue) {
            this.value = value;
            this.minValue = minValue;
        }
    }
    Stack<Pair> st;
    public MinStackBrute() {
        st = new Stack<>();
    }

    void push(int val) {
        if (st.isEmpty()) {
            st.push(new Pair(val, val));
        } else {
            st.push(new Pair(val, Math.min(val, st.peek().minValue)));
        }
    }

    void pop() {
        st.pop();
    }

    int top() {
        return st.peek().value;
    }

    int getMin() {
        return st.peek().minValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MinStackBrute obj = new MinStackBrute();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        obj.top();
        obj.getMin();
    }
}
