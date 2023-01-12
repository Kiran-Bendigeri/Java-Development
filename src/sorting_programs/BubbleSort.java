package sorting_programs;

public class BubbleSort {

	/*
	 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
	 * swapping the adjacent elements if they are in the wrong order. This algorithm
	 * is not suitable for large data sets as its average and worst-case time
	 * complexity is quite high. Time --> O(n2) Space --> O(1)
	 */
	
	// basic Approach
	public static void bubbleSort(int nums[]) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	// Array traverse
	public static void traverse(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	//-------> Recursion approach
	public static void bubbleSortNew(int[] nums, int n) {

		// basic condition check (whether array has 0 or 1 elements)
		if (n == 0 || n == 1) {
			return;
		}

		// if array has more than 1 element
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1])
				swaping(nums, i, (i + 1));
		}
		bubbleSortNew(nums, n - 1);
	}

	public static void swaping(int[] nums, int i, int j) {

		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	public static void main(String[] args) {
		int nums[] = { 5, 4, 3, 0};
//		bubbleSort(nums);
//		traverse(nums);
		bubbleSortNew(nums, nums.length);
		traverse(nums);
	}

}
