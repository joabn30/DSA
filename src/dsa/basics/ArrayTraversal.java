package dsa.basics;

import java.util.ArrayDeque;

public class ArrayTraversal {
	public static void main(String[] args) {
		int[] nums = {50,125,75,70,100};
		int[] P = {1,2,3,4,4,6};
	
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.addLast(10);
		q.addLast(20);
		q.addLast(30);

		reverseQueue(q);
		System.out.println(q); // [30, 20, 10]
		
		System.out.println("Binary Number Conversion");
		generateBinary(5);
		
		QueueWithTwoStacks queue = new QueueWithTwoStacks();
		
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(15);
		queue.printStateArrays();
		queue.dequeue();
		queue.printStateArrays();
		queue.enqueue(20);
		queue.printStateArrays();
		queue.dequeue();
		queue.printStateArrays();
		queue.dequeue();
		queue.printStateArrays();
		queue.dequeue();
		queue.printStateArrays();
		queue.enqueue(5);
		queue.enqueue(25);
		queue.enqueue(45);
		queue.enqueue(55);
		queue.enqueue(65);
		queue.enqueue(75);
		queue.enqueue(85);
		queue.dequeue();

		queue.printStateArrays();



		
		

	}	
		
	/*
	 * This function takes in an array of integers as a parameter and prints out each value of the array.
	 * This function runtime is big O(n), because of the for loop used to print out the values 
	 * of the array.
	 * 
	 */
	public static void printArray(int [] arr) {
		if(arr == null) {
			throw new IllegalArgumentException("Array is empty");
		}
		//Print out the array passed in as the parameter
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}
	/*
	 * This function takes in array of integers as parameter,and finds the biggest number in that array and returns
	 * the max integer in the array. The run time of this method is big O(n), because I'm using one for loop to execute it.

	 * 
	 */
	public static int findMax(int[] arr) {
		if(arr== null || arr.length == 0) {
			throw new IllegalArgumentException("Array is empty or null");
			
		}
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}	
		return max;
	}
	/*
	 * This function takes in an array of integers as a parameter, and uses a for loop to reverse the order of the array
	 * and prints out the reversed array. The overall runtime of the algorithm is big O(n) because i used 1 for loop.
	 * 
	 */
	public static void reverse(int[] arr) {
		//Write a loop that reverses the order of the array
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array can't be empty"); 
		}
		
		int first = 0;
		int last = arr.length -1;
		
		while(first < last) {
			int temp =arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			
			first++;
			last--;
		}
		
	}
	/*
	 * This method receives an array of ints, and returns the sum of all the numbers in the array.
	 */
	public static int Sum(int[] arr) {
		if (arr == null || arr.length== 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		return sum;
		
	}
	/*
	 * Tis method receives two parameters, an array of ints, and a target values.this method loops through the array and returns the index of the target value.
	 */
	public static int indexOf(int [] arr, int target) {
		if (arr == null) {
			throw new IllegalArgumentException("array is empty");
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
		
	}
	/*
	 * The method receives three parameters, an array of integers(nums), an index, and a value. The method inserts the given value at the index index given,
	 * and returns a new array with the inserted value. The runtime of this method is big O(n).
	 * 
	 */
	public static int [] insertAt(int[] arr, int index, int value){
		if(arr == null) {
			throw new IllegalArgumentException("array can't be null");
		}
		if(index < 0 || index > arr.length){
			throw new IllegalArgumentException("Index out of bound"+ index);	
		}
		
		int[] results = new int[arr.length +1];
		
		for(int i = 0; i < index; i++) {
			results[i] = arr[i];
		}
		
		results[index] = value;
		
		for(int i = index; i < arr.length; i++) {
			results[i+1] = arr[i];
		}
		
		return results;
	}
	/*
	 * This function takes in an array of integers and index. The function should remove the integer at the given index from the array. 
	 * As for the runtime of this function, I think it's running at big O(n) because even though there are two loops in the function,
	 * they are not nested together, therefore the runtime in O(n).
	 * 
	 */
	public static int [] removeAt(int [] arr, int index) {
		if(arr == null) {
			throw new IllegalArgumentException("array can't be null");
		}
		if(arr.length == 0) {
			throw new IllegalArgumentException("Array can't empty");
		}
		if(index < 0 || index >= arr.length) {
			throw new IllegalArgumentException("index out of bound"+ index);
		}
		
		int [] revised = new int[arr.length-1];
		
		for(int i = 0; i < index; i++) {
			revised[i]= arr[i];
		}
		for(int i = index +1; i <arr.length; i++) {
			revised[i-1]= arr[i];
		}
		
		return revised;
	}
	public static void swap(int[] arr, int i, int j) {
		if (arr == null) {
			throw new IllegalArgumentException("array can't be null");
		}
		if (i > arr.length) {
			throw new IllegalArgumentException("Index out of bound"+ i);
		}
		if (j > arr.length) {
			throw new IllegalArgumentException("Index out of bound"+ j);
			
		}
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}	
		

	
	public static void reverseRange(int[] arr, int left, int right) {
		if(arr == null) {
			throw new IllegalArgumentException("array can't be null");
		}
		if(left < 0) {
			throw new IllegalArgumentException("index out of bound" + left);
		}
		if(right >=arr.length || left > right) {
			throw new IllegalArgumentException("index out of bound");
		}
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		
	}
	public static int [] removeAll(int [] arr, int valueToRemove) {
		if(arr==null) {
			throw new IllegalArgumentException("Array can't be null");
		}
		
		int count = 0;
		for(int i = 0;i<arr.length; i ++) {
			if(arr[i] != valueToRemove) {
				count++;
			}
		}
		
		int []fresh= new int[count];
		int n= 0;
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] != valueToRemove) {
				fresh[n] = arr[j];
				n++;
			}
		
		}
		return fresh;
		
	}
	public static boolean IsPalindrome(int[] arr) {
		if(arr == null) {
			throw new IllegalArgumentException("Array Can't be empty");
		}
		if(arr.length == 0 || arr.length == 1) {
			return true;
		}
		
		int left = 0;
		int right = arr.length -1;
		
		while(left < right) {
			if(arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
	
	public static boolean isSorted(int[] arr) {
		if(arr == null) {
			throw new IllegalArgumentException("array is Empty");
		}
		if(arr.length == 0 || arr.length == 1) {
			return true;
		}
		for(int i =1; i <arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
		
	}
	public static void BubbleSort(int [] arr) {
		if(arr == null) {
			throw new IllegalArgumentException("Array is Empty!");
		}
		
		for(int i = 1;i < arr.length; i++) {
			for(int j = 0;j<arr.length -1;j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void SelectionSort(int[] arr) {
		if(arr == null) {
			throw new IllegalArgumentException("Array is Empty!");
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			int minindex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			swap(arr,i,minindex);
		}
	}
	
	public static int BinarySearch(int arr [],int target) {
		if(arr == null) {
			throw new IllegalArgumentException("array can't be null");
		}
		if(arr.length == 1) {
			return -1;
		}
		
		if(!(isSorted(arr))) {
			SelectionSort(arr);
			
		}
		
		int left = 0;
		int right = arr.length -1;				
		while(left <= right) {
			int mid = (left + right)/2;
			int midvalue = arr[mid];

				
			if(midvalue==target) {
				return mid;
			}
			else if(midvalue < target) {
				left = mid + 1;
			}
			else{
				right = mid - 1;	
			}
			
		}
		
		return -1;
	}
	public static int firstOccurence(int[] arr, int target) {
		if(arr == null) {
			throw new IllegalArgumentException("Array is empty");
		}
		if(arr.length == 1) {
			return -1;
			
		}
		int left = 0;
		int right = arr.length - 1;
		int ans = -1;
		
		while (left <= right) {
			int midpoint = (left + right)/2;
			if(arr[midpoint] == target) {
				ans = midpoint;
				right = midpoint - 1;
			}else if(arr[midpoint] < target) {
				left = midpoint + 1;
			}else {
				right = midpoint -1;
			}	
		}
		
		return ans;
	}
	
	public static int lastOccurence(int[] arr, int target) {

		if(arr == null) {
			throw new IllegalArgumentException("Array is empty");
		}
		if(arr.length == 1) {
			return -1;
			
		}
		int left = 0;
		int right = arr.length - 1;
		int ans = -1;
		
		while (left <= right) {
			int midpoint = (left + right)/2;
			if(arr[midpoint] == target) {
				ans = midpoint;
				left= midpoint + 1;
			}else if(arr[midpoint] < target) {
				left = midpoint + 1;
			}else {
				right = midpoint -1;
			}	
		}
		
		return ans;
	
	}
	public static boolean isValidParenthesis(String s) {
		if(s == null) {
			throw new IllegalArgumentException("String is empty");
		}
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		//char first = s.charAt(0);
		for(int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if(curr == '(' || curr == '{' || curr == '[') {
				stack.push(curr);
			}else if(curr == ')' || curr == '}'|| curr == ']') {
				
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				
				if(curr == ')' && top != '(') {
					return false;
				}
				if(curr == ']' && top != '[') {
					return false;
				}
				if(curr== '}' && top != '{') {
					return false;
				}
				

			}
		}
				
		return stack.isEmpty();
	}
	
	public static String reverseString(String s) {
		if(s == null) {
			throw new IllegalArgumentException("String is empty!");
		}
		
		//Use a stack Data Structure
		ArrayDeque<Character> stack = new ArrayDeque<>();
		StringBuilder builder = new StringBuilder(s.length());
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			stack.push(c);
		}
		
		String rev= "";		
		//push the popped chars into the new string;
		for(int i = 0; i < s.length(); i++) {
			char r = stack.pop();
			builder.append(r);
		}
		
		//Convert String Builder into a final immutable String.
		rev = builder.toString();
		
		
		
		return rev;
	}
	public static void reverseQueue(ArrayDeque<Integer> queue) {
		if(queue == null) {
			throw new IllegalArgumentException("Queue is empty!");
			}
		
		//Push items in Queue into a stack
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		while(!queue.isEmpty()) {
			int curr = queue.peek();
			stack.push(curr);
			//Can use poll() or removeFirst()..
			queue.poll();
		}
		
		while(!stack.isEmpty()) {
			int cur = stack.peek();
			//Wanted to use queue.enqueue() but it wasn't available;
			queue.addLast(cur);
			stack.pop();
		}
	}
	public static void generateBinary(int n) {
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		
		for(int i = 1; i <= n; i++) {
			queue.addLast(n);
		}
		
		for(int i = 1; i <= n; i++) {
			queue.poll();
			String x = Integer.toBinaryString(i);
			System.out.println(x + "\n");
		}
		
	}
	
	
	
	

	
}
