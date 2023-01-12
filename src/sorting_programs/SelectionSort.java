package sorting_programs;

public class SelectionSort {
	public static void selectionSort(int[] nums) {
			
		// O(n2) --> Basic approach
		for (int i = 0; i < nums.length; i++) {
			int minPosition = i;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[minPosition] < nums[j])
					minPosition = j;
			}
			int temp = nums[i];
			nums[i] = nums[minPosition];
			nums[minPosition] = temp;	
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 4, 1, 0, 6, 8};
		selectionSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");			
		}
	}
}
