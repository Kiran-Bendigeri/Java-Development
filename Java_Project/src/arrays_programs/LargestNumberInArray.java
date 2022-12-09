package arrays_programs;

public class LargestNumberInArray {
	
	public static int largestInt(int[] n) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < n.length; i++) {
			if (largest<n[i])
				largest = n[i];
			if (smallest > n[i])
				smallest = n[i];
		}
		System.out.println("The smallest number is = "+smallest);
		return largest;
	}

	public static void main(String[] args) {
		
		int[] nums = {10, 120, 8, 5, 3, 1, 7, 15, 8};
		System.out.println("The largest number is = "+largestInt(nums));
	}

}
