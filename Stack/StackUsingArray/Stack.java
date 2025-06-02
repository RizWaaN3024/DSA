package StackUsingArray;
import java.util.*;

public class Stack {
    static final int MAX = 1000;
    static int top;
    static int arr[] = new int[MAX];

    static boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    static boolean push(int val) {
        if (top == (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            arr[++top] = val;
            System.out.println(val + "Pushed into the stack");
            return true;
        }
    }

    static int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int val = arr[top--];
            return val;
        }
    }

    static int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return arr[top];
        }
    }

    static void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(" " + arr[i]);
        }
    }
}