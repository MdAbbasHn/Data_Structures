package queues;

public class CircularQueue {

	int[] que;
	int front;
	int rear;
	int size;
	public CircularQueue(int i) {
		que = new int[i];
		front = -1;
		rear = -1;
		size = 0;
	}
	public void enqueue(int d) {
		if(isFull()) {
			throw new IndexOutOfBoundsException("Queue is full");
		}
		if(front==-1&&rear==-1) {
			front = 0;
		}
		rear = (rear+1)%que.length;
		que[rear] = d;
		size++;
		System.out.println(d+" has been enqueued.");
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(que[front]+" has been dequeued");
		front++;
		size--;
	}
	public int getFront() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return que[front];
	}
	public int getRear() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return que[rear];
	}
	public boolean isEmpty() {
		return front==-1&&rear==-1;
	}
	public boolean isFull() {
		return front==(rear+1)%que.length;
	}
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(6);
		q.enqueue(19);
		q.enqueue(34);
		q.enqueue(8);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		int a = q.getFront();
		int b = q.getRear();
		System.out.println("Front: "+a);
		System.out.println("Rear: "+b);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		a = q.getFront();
		b = q.getRear();
		System.out.println("Front: "+a);
		System.out.println("Rear: "+b);
		q.enqueue(40);
		q.enqueue(23);
		q.enqueue(6);
		a = q.getFront();
		b = q.getRear();
		System.out.println("Front: "+a);
		System.out.println("Rear: "+b);
	}

}
