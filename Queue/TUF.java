package Queue;

public class TUF {
	public static void main(String[] args) {

		Queue q = new Queue(4);

		q.queueDisplay();
		q.queueEnqueue(20);
		q.queueEnqueue(30);
		q.queueEnqueue(40);
		q.queueEnqueue(50);
		q.queueDisplay();
		q.queueEnqueue(60);

		q.queueDisplay();

		q.queueDequeue();
		q.queueDequeue();
		System.out.println("after two node deletion");

		q.queueDisplay();

		q.queueFront();
	}
}