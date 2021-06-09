package queues;

public class Queue_Array {

	int[] que;
	int front;
	int rear;
	int size;
	public Queue_Array(int i) {
		que = new int[i];
		front = 0;
		rear = -1;
		size = 0;
	}
	public void enqueue(int d) {
		if(rear>=que.length-1) {
			throw new IndexOutOfBoundsException("Queue is full");
		}
		que[++rear] = d;
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
		return size==0;
	}
	public static void main(String[] args) {
		Queue_Array q = new Queue_Array(20);
		q.enqueue(19);
		q.enqueue(34);
		q.enqueue(8);
		q.dequeue();
		int a = q.getFront();
		int b = q.getRear();
		System.out.println("Front: "+a);
		System.out.println("Rear: "+b);
	}

}
