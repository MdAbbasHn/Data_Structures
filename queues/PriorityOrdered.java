package queues;

public class PriorityOrdered { //Higher the number, higher the priority and order adjusted during enqueue
	int[] q;
	int size;
	int front,rear;
	public PriorityOrdered(int s) {
		q = new int[s];
		size = 0;
		front = rear = -1;
	}
	public int enqueue(int n) {
		if(size+1==q.length) {
			throw new IndexOutOfBoundsException("Cannot enqueue. Queue is full");
		}
		if(front==-1) {
			q[++front] = n;
		}
		else {
			int i=size-1;
			while(i>=0&&n<q[i]) {
				q[i+1] = q[i];
				i--;
			}
			q[i+1] = n;
			size++;
			rear++;
		}
		return n;
	}
	public int dequeue() {
		if(size==0) {
			System.out.println("Queue is empty.");
			return -999;
		}
		else {
			int a = q[rear];
			rear--;
			size--;
			return a;
		}
	}
	public void printList() {
		for(int i=0;i<size;i++) {
			System.out.println(q[i]);
		}
	}
	public static void main(String[] args) {
		PriorityOrdered po = new PriorityOrdered(6);
		po.enqueue(12);
		po.enqueue(4);
		po.enqueue(45);
		po.enqueue(13);
		po.enqueue(78);
		po.enqueue(1);
		po.printList();
		po.dequeue();
		po.dequeue();
		po.printList();
	}

}
