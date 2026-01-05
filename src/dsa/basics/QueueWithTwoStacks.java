package dsa.basics;

import java.util.ArrayDeque;
import java.util.Arrays;

public class QueueWithTwoStacks {
	private final ArrayDeque<Integer> inStack = new ArrayDeque<>();
	private final ArrayDeque<Integer> outStack = new ArrayDeque<>();
	
	
	public void enqueue(int x) {
	    inStack.addLast(x);
	}

	public int dequeue() {
		if(isEmpty()) 
			throw new IllegalStateException("Queue Empty!");
		shiftStacksIfNeeded();
		
		int out = outStack.pop();
		return out;
	}

	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		shiftStacksIfNeeded();
			
		int val = outStack.peek();
		return val;
	}

	public boolean isEmpty() {
		if(outStack.isEmpty() && inStack.isEmpty()) {
			return true;
		}
		 return false;
	 }

	 private void shiftStacksIfNeeded() {
	        // TODO: if outStack empty, move all from inStack -> outStack
		 if(outStack.isEmpty()) {
			 while(!inStack.isEmpty()) {
				 int from = inStack.pop();
				 outStack.addLast(from);
			 }
		 }
	  }
	 
	 private static String asArray(ArrayDeque<Integer> d) {
	     return Arrays.toString(d.toArray());
	 }

	 public void printStateArrays() {
	     System.out.println("inStack  (top->bottom) = " + asArray(inStack));
	     System.out.println("outStack (top->bottom) = " + asArray(outStack));
	     System.out.println("--------------------------------");
	 }



}
