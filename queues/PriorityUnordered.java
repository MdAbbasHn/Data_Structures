package queues;

public class PriorityUnordered {

	int[] q;
	int size;
	public PriorityUnordered(int s) {
		q = new int[s];
		size = 0;
	}
	public int enqueue(int d) {
		if(size==q.length) {
			System.out.println("Queue is full");
			return -999;
		}
		q[size++] = d;
		return d;
	}
	public int dequeue() {
		int a;
		if(size==0) {
			System.out.println("Queue is empty");
			return -999;
		}
		else {
			int x = 0;
			for(int i=0;i<size;i++) {
				if(q[i]>=q[x]) {
					x = i;
				}
			}
			a = q[x];
			q[x] = q[size-1];
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
		PriorityUnordered pu = new PriorityUnordered(6);
		pu.enqueue(34);
		pu.enqueue(4);
		pu.enqueue(67);
		pu.enqueue(12);
		pu.enqueue(17);
		pu.enqueue(9);
		pu.printList();
		pu.dequeue();
		pu.dequeue();
		pu.dequeue();
		System.out.println("-------------");
		pu.printList();
	}

}
