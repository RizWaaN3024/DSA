package QueueUsingLL;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // Function to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
            printQueue();
            return;
        }
        rear.next = newNode;
        rear = newNode;
        printQueue();
    }

    // Function to remove an element from the queue
    public void dequeue() {
        if (isEmpty()) {
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        temp = null;
        printQueue();
    }

    // Function to print the current state of the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        System.out.println("Current Queue:");
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
