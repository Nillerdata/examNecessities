package QueueAndCircularLists.src.queueopgaver;

public class QueueDemo {
	public static void main(String[] args) {
//		QueueI<String> q = new ArrayQueue();
//		QueueI<String> q = new NodeQueue<>();
		QueueI<String>q = new Deque<>();
		q.enqueue("Tom");
		q.enqueue("Diana");
		q.enqueue("Harry");
		q.enqueue("Thomas");
		q.enqueue("Bob");
		q.enqueue("Brian");
		System.out.println(q.getFront());
		System.out.println(q.isEmpty() + " " + q.size());
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		System.out.println();
		System.out.println(q.isEmpty() + " " + q.size());
		System.out.println();
		q.enqueue("Anna");
		q.enqueue("Lotte");
		System.out.println(q.isEmpty() + " " + q.size());
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		System.out.println();
		System.out.println(q.isEmpty() + " " + q.size());
	}
}
