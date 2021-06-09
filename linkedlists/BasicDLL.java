package linkedlists;
//Doubly Linked List(DLL)
public class BasicDLL {

	protected DLLNode head,tail;
    protected int size;
    public BasicDLL() {
    	head = null;
    	tail = null;
    	size=0;
    }
    public void addNode(int data) {
    	DLLNode node = new DLLNode(data);
    	if(head == null) {
        	head = node;
        	tail = node;
    	}
    	else {
        	node.prev = tail;
        	tail.next = node;
        	tail = node;
    	}
    	size+=1;
    }
    public void addFront(int d) {
    	if(listEmpty()) {
			System.out.println("Cannot do the current operation because list is empty");
			return;
		}
    	DLLNode node = new DLLNode(d);
    	if(head==null) {
        	head = node;
        	tail = node;
    	}
    	else {
    		head.prev = node;
    		node.next = head;
    		head = node;
    	}
    	size+=1;
    }
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
    	DLLNode node = new DLLNode(data);
    	DLLNode curr = head;
    	for(int i=1;i<index;i++) {
    		curr = curr.next;
    	}
    	node.next = curr.next;
    	curr.next.prev = node;
    	curr.next = node;
    	node.prev = curr;
    	size+=1;
    }
    public void removeNode(int index) {
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
			head.next.prev = null;
			head = head.next;
		}
		else if(index == size) {
			tail.prev.next = null;
			tail = tail.prev;
		}
		else {
			
			DLLNode curr = head;
			for(int i=1;i<=index;i++) {
				curr = curr.next;
			}
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
		}
		size-=1;
    }
    public void printList() {
    	if(listEmpty()) {
			System.out.println("Cannot do the current operation because list is empty");
			return;
		}
    	DLLNode curr = head;
    	while(curr!=null) {
    		System.out.print(curr.data+" ");
    		curr=curr.next;
    	}
    }
    public int getSize() {
    	return size;
    }
    public boolean listEmpty() {
		return size<=0;
	}
	public static void main(String[] args) {
		BasicDLL dll = new BasicDLL();
		dll.printList();
		
		if(dll.tail==null) System.out.println("Cannot give tail data because list is empty");
		else System.out.println("\nTail data is "+dll.tail.data);
		
		System.out.println("Size is "+dll.getSize());
		dll.removeNode(8);
		dll.removeNode(2);
		dll.printList();
		if(dll.tail==null) System.out.println("Cannot give tail data because list is empty");
		else System.out.println("\nTail data is "+dll.tail.data);
		System.out.println("Size is "+dll.getSize());
	}
}
class DLLNode{
    DLLNode prev,next;
	int data;
	public DLLNode(int data){
		this.prev = null;
		this.next = null;
		this.data = data;
	}
}