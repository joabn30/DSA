package dsa.basics;

public class ArrayTraversal {
	public static void main(String[] args) {
		int[] nums = {5,25,50,75,100};
		
		
		//Print out the array
		printArray(nums);
		
		System.out.println("******Return the arrray*******");
		int total = Sum(nums);
		System.out.println(total);
		
		System.out.println("******Return IdexOf the value******");
		int index = indexOf(nums,100);
		System.out.println(index);
		
		System.out.println("******Return New Array**********");
		int [] res = new int[6];
		
		res = insertAt(nums,2,30);
		
		printArray(res);
		
		System.out.println("*****Return Array with removed value*******");
		
		int []remove = new int[nums.length - 1];
		
		remove = removeAt(nums, 2);
		
		printArray(remove);
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
		/*for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		*/
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
	public static int [] removeAt(int [] arr, int index) {
		if(arr == null) {
			throw new IllegalArgumentException("array can't be null");
		}
		if(index < 0 || index > arr.length) {
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

}
