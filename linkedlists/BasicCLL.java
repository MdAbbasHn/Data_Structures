package linkedlists;
//Circular Linked List(CLL)
public class BasicCLL {

	CLLNode head;
	int size;
	public BasicCLL() {
		head = null;
		size = 0;
	}
	public void addNode(int d) {
		CLLNode curr = new CLLNode(d);
		curr.data= d;
		if(head==null) {
			head = curr;
			head.next = head;
		}
		else{
			CLLNode fut = head;
			do {
				fut = fut.next;
			}while(fut.next!=head);
			fut.next = curr;
			curr.next = head;
		}
		size++;
	}
	public void addAtFront(int d) {
		CLLNode curr = new CLLNode(d);
		if(head==null) {
			 head = curr;
			 head.next = head;
		}
		else {
			curr.next = head;
			CLLNode node = head;
		do {
			node = node.next;
		}while(node.next!=head);
		node.next = curr;
		head = curr;
		size++;
		}
	}
	public void addAtIndex(int pos,int data) {
		if(pos+2>size) {
			throw new IndexOutOfBoundsException("Postion specified is more than the last position of the list");
		}
		if(pos==1) {
			addAtFront(data);
		}
		else if(pos+1==size) {
			addNode(data);
		}
		else {
			CLLNode curr = head;
			CLLNode node = new CLLNode(data);
			for(int i=1;i<pos-1;i++) {
				curr = curr.next;
			}
			node.next = curr.next;
			curr.next = node;
			size++;
		}
	}
	public void removeNode(int index) {
		if(index<1||index>size) {
			throw new IndexOutOfBoundsException("Index given is not valid");
		}
		if(index==1) {
			CLLNode node = head;
			CLLNode curr= head;
			head = curr.next;
			do {
				curr=curr.next;
			}while(curr.next!=node);
			curr.next = head;
		}
		else if(index==size) {
			CLLNode curr = head;
			do {
				curr=curr.next;
			}while(curr.next.next!=head);
			curr.next = head;
		}
		else {
			CLLNode curr = head;
			for(int i=1;i<index-1;i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
		}
		size--;
	}
	public void search(int d) {
		CLLNode node = head;
			for(int i=1;i<=size;i++) {
				if(node.data==d) {
					System.out.println("Data found at position: "+i);
					return;
				}
				node = node.next;
		}
			System.out.println("Given data does not exist in the linked list!");
	}
	public void printList() {
		CLLNode curr = head;
		do {
			System.out.println(curr.data);
			curr = curr.next;
		}while(curr!=head);
	}
	public void getSize() {
		System.out.println("Size of linked list is: "+ size);
	}
	public static void main(String[] args) {
		BasicCLL curr = new BasicCLL();
		curr.addNode(1);//3,1,67,2,4,5
		curr.addNode(2);
		curr.addAtFront(3);
		curr.addNode(4);
		curr.addNode(5);
		curr.addAtIndex(3, 67);
		curr.removeNode(6);
		curr.printList();
		curr.search(67);
	}

}
class CLLNode{
	int data;
	CLLNode next;
	public CLLNode(int d) {
		data = d;
		next = null;
	}
}
