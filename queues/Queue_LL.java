package queues;

public class Queue_LL {

	LLNode front;
	LLNode rear;
	public Queue_LL() {
		front = rear = null;
	}
	public void enqueue(int d) {
		LLNode node = new LLNode(d);
		if(front==null) {
			front = rear = node;
		}
		else {
			rear.next = node;
			rear = node;
		}
		System.out.println(rear.data+" has been enqueued");
	}
	public void dequeue() {
		if(front==null) {
			throw new NullPointerException("Can't dequeue. Queue is empty.");
		}
		else {
			System.out.println(front.data+" has been dequeued");
			front = front.next;
		}
	}
	public void printList() {
		LLNode node = front;
		for(;node!=null;) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	public void getFront() {
		if(isEmpty()) {
			throw new NullPointerException("Can't get front. Queue is empty.");
		}
		System.out.println("Element at the front is "+front.data);
	}
	public void getRear() {
		if(isEmpty()) {
			throw new NullPointerException("Can't get rear. Queue is empty.");
		}
		System.out.println("Element at the rear is "+rear.data);
	}
	public boolean isEmpty() {
		return front==null;
	}
	public static void main(String[] args) {
		Queue_LL qll = new Queue_LL();
		qll.enqueue(12);
		qll.enqueue(13);
		qll.enqueue(14);
		qll.enqueue(15);
		qll.enqueue(16);
		qll.enqueue(17);
		qll.enqueue(18);
		qll.printList();
		qll.getFront();
		qll.getRear();
	}

}
class LLNode{
	LLNode next;
	int data;
	public LLNode(int d) {
		next = null;
		data = d;
	}
}
