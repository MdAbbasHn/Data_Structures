package linkedlists;
//Singly Linked List(SLL)
public class BasicSLL {
//Declaring variables
	protected SLLNode head,tail;
	protected int size;
	public BasicSLL(){
		head = null;
		tail = null;
		size=0;
	}
// Adding new node to the SLL at the end
	public void addNode(int data) {
		SLLNode node = new SLLNode(data);
		if(head == null) {
			head=node;
			tail=node;
			size+=1;
		}
		else{
			tail.next = node;
			tail = node;
			size+=1;
		}
	}
	// Add node to the start of the LL
	public void addFront(int data){
		
		SLLNode node = new SLLNode(data);
		if(head==null) {
			head=node;
			tail=node;
			size+=1;
		}
		else {
			node.next = head;
			head=node;
			size+=1;
		}
	}
	// Add node at a particular index
	public void addAtIndex(int index,int data) {
		if(listEmpty()) {
			System.out.println("Cannot do the current operation because list is empty");
			return;
		}
		if(index>size) {
			throw new IndexOutOfBoundsException("Given index: "+index+",current size for the linkedlist is "+size);

		}
		if(index<0) {
			throw new IndexOutOfBoundsException("Given index is less than 0, and therefore not a valid index");

		}
		if(index == 0) {
			addFront(data);
			return;
		}
		if(index == size) {
			addNode(data);
			return;
		}
		SLLNode node = new SLLNode(data);
		SLLNode curr = head;
		for(int i=0;i<index-1;i++){
			
			curr=curr.next;
		}
		node.next = curr.next;
		curr.next = node;
		size+=1;
	}
	public void removeNode(int index) {
		if(listEmpty()) {
			System.out.println("Cannot do the current operation because list is empty");
			return;
		}
		if(index>=size) {
			throw new IndexOutOfBoundsException("Max input for index can be "+(size-1)+". Given index = "+index);
		}
		if(index<0) {
			throw new IndexOutOfBoundsException("Given index is less than 0, and therefore not a valid index");
		}
		if(index == 0 && size-1 == 0) {
			head=head.next;
			size-=1;
			tail=null;
			return;
		}
		if(index == 0) {
			head=head.next;
			size-=1;
			return;
		}
		SLLNode curr = head;
		for(int i=0;i<index-1;i++) {
			curr=curr.next;
		}
		if(index == size-1) {
			tail=curr;
		}
		curr.next = curr.next.next;
		size-=1;
	}
	// Simply search for element and return string if it exists or not
	public String search(int d) {
		if(listEmpty()) {
			return "Cannot do the current operation because list is empty";
		}
		SLLNode curr = head;
		while(curr!=null) {
			if(curr.data==d) {
				return "Node with the given data exists";
			}
			curr= curr.next;
		}
		return "Given data not found in any node";
	}
	public int getSize() {
		return size;
	}
// Displaying the data of each node
	public void display() {
		if(listEmpty()) {
			System.out.println("Cannot do the current operation because list is empty");
			return;
		}
		SLLNode node = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
			
		}
	}
	
}
	public boolean listEmpty() {
		return size<=0;
	}
	//Main method
	public static void main(String[] arg) {
		BasicSLL sll = new BasicSLL();
		sll.addNode(10);
		sll.addNode(20);
		sll.addNode(40);
		sll.addFront(30);
		sll.addNode(67);
		sll.removeNode(0);
		sll.removeNode(0);
		sll.removeNode(0);
		sll.removeNode(0);
		sll.addAtIndex(0, 17);
		sll.addFront(0);
		sll.addNode(90);
		sll.removeNode(0);
		sll.removeNode(0);
		sll.removeNode(0);
		sll.removeNode(0);
		sll.removeNode(0);
		sll.display();
		SLLNode n = sll.tail;
		if(n!=null) {
		System.out.println("\nTail data is "+n.data);
		}
		else {
			System.out.println("Requested tail data is null because list is empty");	
		}
		System.out.println("Size of LL is "+sll.getSize());
		System.out.println(sll.search(90));
	}
}
//Class for a new node
class SLLNode{
	int data;
	SLLNode next;
	public SLLNode(int data) {
		this.data = data;
		this.next = null;
	}
}