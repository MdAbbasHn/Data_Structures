package linkedlists;
//Circular Doubly Linked List(CDLL)
public class BasicCDLL {
 
	static CDLLNode head;
	int size;
	public BasicCDLL() {
		head = null;
		size = 0;
	}
	public void addNode(int data) {
		CDLLNode node = new CDLLNode(data);
		if(head==null) {
			head = node;	
			head.next = head;
		}
		else {
			CDLLNode curr = head;
			do {
				curr = curr.next;
			}while(curr.next!=head);
			node.next = head;
			node.prev = curr;
			curr.next = node;
		}
		size++;
	}
	public void addAtFront(int data) {
		CDLLNode node = new CDLLNode(data);
		if(head==null) {
			head = node;	
			head.next = head;
		}
		else {
			head.prev = node;
			node.next = head;
			head = node;
		}
		size++;
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
			CDLLNode curr = head;
			CDLLNode node = new CDLLNode(data);
			for(int i=1;i<pos-1;i++) {
				curr = curr.next;
			}
			curr.next.prev = node;
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
			CDLLNode node = head;
			CDLLNode curr= head;
			head = curr.next;
			head.prev = null;
			do {
				curr=curr.next;
			}while(curr.next!=node);
			curr.next = head;
		}
		else if(index==size) {
			CDLLNode curr = head;
			do {
				curr=curr.next;
			}while(curr.next.next!=head);
			curr.next = head;
		}
		else {
			CDLLNode curr = head;
			for(int i=1;i<index-1;i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
			curr.next.prev = curr;
		}
		size--;
	}
	public void search(int d) {
		CDLLNode curr = head;
		for(int i=1;i<=size;i++) {
			if(curr.data == d) {
				System.out.println("Data has been found at position: "+i);
				return;
			}
			curr = curr.next;
		}
		System.out.println("Given data does not exist in the linked list");
	}
	public void printList() {
		if(head==null) {
			throw new NullPointerException("Linked list is empty");
		}
		System.out.println("------------------------------------");
		CDLLNode curr = head;
		do {
			System.out.println(curr.data+" : "+curr.next.data);
			curr = curr.next;
		}while(curr!=head);
		System.out.println("------------------------------------");
	}
	public static void main(String[] args) {
		BasicCDLL cdll = new BasicCDLL();
		cdll.addNode(3);
		cdll.addNode(4);
		cdll.addNode(5);
		cdll.addNode(6);
		cdll.printList();
		cdll.removeNode(2);
		cdll.printList();
		cdll.search(6);
	}

}
class CDLLNode{
	CDLLNode prev;
	CDLLNode next;
	int data;
	public CDLLNode(int d) {
		prev = null;
		next = null;
		data = d;
	}
}
