package dsa.basics;

public class Stack {
	int maxsize;
	int [] stack;
	int top;
	
	//Constructor
	public Stack(int maxsize) {
		this.maxsize = maxsize;
		stack = new int[maxsize];
		this.top = -1;
	}
	
	public void push(int value) {
			if(top == maxsize - 1) {
				throw new IllegalStateException("Stack is too full");
			}else {
				top++;
				stack[top]= value;
			}
		
	}
	public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}else {
			int val = stack[top--];
			
			System.out.println("Popped from the stack:"+ val);
			//top--;
			return val;

		}
		
	}
	public int peek() {
		if(top == -1) {
			throw new IllegalStateException("Stack is Empty");
		}
		int ontop = stack[top];
		System.out.println("Top element on Stack: "+ ontop);
		return ontop;
	}
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
			
		}
	}
	public int size() {
		if(top == -1) {
			return -1;
		}
		else {
			return top + 1;
		}
	}
	public void printStack() {
		if(top == -1) {
			throw new IllegalArgumentException("Array is empty");
		}
		//Print out the array passed in as the parameter
		System.out.println("******Print Out the Stack**********\n");
		for(int i = 0; i <=top; i++) {
			System.out.println(stack[i]);
			
		}
		
	}


}
