package LinkedList.customLinkedListTwo;

public class CustomLinkedList<T> {
    public class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node<T> head;
    private int size;

    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    // Adding an element to the end of the linkedlist (append)
    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Adding an element to the begining (prepend)
    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;
        size++;
    }

}
