package QueueUsingLL;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        // Enqueue elements into the queue
        q.enqueue(10);
        q.enqueue(20);

        // Dequeue elements from the queue
        q.dequeue();
        q.dequeue();

        // Enqueue more elements into the queue
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // Dequeue an element from the queue (this should print 30)
        q.dequeue();
    }
}
