package Queue;
import java.util.*;

public class Queue {
    private static int front, rear, capacity;
    private static int queue[];

    Queue(int val) {
        front = rear = 0;
        capacity = val;
        queue = new int[capacity];
    }

    static void queueEnqueue(int data) {
        if (capacity == rear) {
            System.out.println("Stack is full");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    static void queueDequeue()
    {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (rear < capacity) {
                queue[rear] = 0;
            }
            rear--;
        }
        return;
    }

    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (i = front; i < rear; i++) {
			System.out.printf("%d ", queue[i]);
		}
		System.out.println();
		return;
    }

    static void queueFront()
    {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Front Element is: "+queue[front]);
		return;
    }
}
