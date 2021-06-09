package stacks;

public class Stack_Array {

	int top;
	int[] stack;
	int size;
	public Stack_Array() {
		top = -1;
		stack = new int[6];
		size = 0;
	}
	public void push(int data) {
		if(top>=stack.length-1) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = data;
		size++;
		System.out.println(data+" was pushed into the stack");
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println(stack[top]+" was popped out from the stack");
		top--;
		size--;
		
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			return stack[top];
		}
	}
	public boolean isEmpty() {
		return top<0;
	}
	public void printStack() {
		for(int i=0;i<=top;i++) {
			System.out.println("stack["+i+"]= "+stack[i]);
		}
	}
	public static void main(String[] args) {
		Stack_Array st =  new Stack_Array();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.printStack();
		st.pop();
		st.pop();
		st.printStack();
		System.out.println("TOP: "+st.peek());
		System.out.println("Size: "+st.size);
	}

}
