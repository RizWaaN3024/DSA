package StackUsingLL;

public class Stack {
    Node top;

    Stack () {
        this.top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (newNode == null) {
            System.out.println("Stack Overflow");
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        } else {
            Node temp = top;
            top = top.next;
            temp = null;
        }
    }

    int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
    }
    
}
