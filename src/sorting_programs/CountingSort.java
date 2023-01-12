package sorting_programs;

public class CountingSort {
	
	/* CONDITIONS
	 * ^^^^^^^^^^
	 * In this range must be predefined
	 * Length of the array must be defined
	 * ------------------------------------
	 * Counting sort can be performed only on positive numbers
	 * because negetive index are dosen't exist
	 * 
	 */
	
	public static void countingSort(int nums[]) {
		int largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			largest = Math.max(largest, nums[i]);
		}
		
		/*
		 *  here taking +1 index will be starting from 0 to largest number
		 */
		int temp[] = new int[largest+1]; 
		
		for (int i = 0; i < nums.length; i++) {
			temp[nums[i]]++;
		}
		
		//sorting
		int j = 0;
		for (int i = 0; i < temp.length; i++) {
			while(temp[i]>0) {
				nums[j] = i;
				j++;
				temp[i]--;
			}
		}	
		
	}
	
	public static void printArray(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");			
		}
	}
	public static void main(String[] args) {
		int[] nums = {6, 5, 8, 1, 4, 1, 8, 9, 7, 9, 1, 8, 6, 7, 5, 3, 4};
		countingSort(nums);
		int start = 0, end = nums.length-1;
		//  reversed the array
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end]= temp;
			start++;
			end--;
		}
		// printing reversed array
		printArray(nums);
	}

}
