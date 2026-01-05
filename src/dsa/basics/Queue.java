package dsa.basics;

public class Queue {
	int [] data;
	int front;
	int rear;
	int size;
	int capacity;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		data = new int[this.capacity];
		this.size = 0;
		this.front = 0;
		this.rear = 0;
	}
	
	public void enqueue(int value) {
		if(isFull()) {
			throw new IllegalStateException("Queue is full");
		}else {
			data[this.rear]=value;
			rear = (rear + 1)% this.capacity;
			size++;
		}
		
	}
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		else {
			int remove = data[this.front];
			System.out.println("Dequeued Item: " + remove);
			front = (front + 1) % this.capacity;
			size--;
			return remove;
		}
	}
	public void peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Nothing to Peek");
		}
		else {
			System.out.println("Item at Front: " + data[front]);
		}
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(size == capacity) {
			return true;
		}
		return false;
	}
	public int size() {
		System.out.println("Size of Queue:" + this.size);
		return size;
	}
	public void PrintQueue() {
		if (isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        System.out.println("Front -> Back");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.println(data[index]);
        }
		
	}
}
