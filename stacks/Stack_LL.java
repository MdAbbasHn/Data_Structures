package stacks;

public class Stack_LL {

	LLNode head;
	int size;
	public Stack_LL() {
		head = null;
		size = 0;
	}
	public void push(int d) {
		LLNode node = new LLNode(d);
		if(isEmpty()) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
		System.out.println(head.data+" has been pushed into the stack.");
		size++;
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return;
		}
		else {
			LLNode curr = head;
			System.out.println(curr.data+" has been popped out of the stack.");
			head = curr.next;
		}
		size--;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			return head.data;
		}
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void printStack() {
		LLNode curr = head;
		for(int i=1;curr!=null;i++) {
			System.out.println(i+ "= "+curr.data);
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		Stack_LL st = new Stack_LL();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println("Top of the stack: "+st.peek());
		st.printStack();
		st.pop();
		st.printStack();
		System.out.println("Top of the stack: "+st.peek());
	}
	
}
class LLNode{
	int data;
	LLNode next;
	public LLNode(int d) {
		data = d;
		next = null;
	}
}
