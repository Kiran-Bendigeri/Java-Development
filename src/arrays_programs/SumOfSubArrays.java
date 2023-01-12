package arrays_programs;

public class SumOfSubArrays {
	
	// BruteForce or Basic Approach
	public static void sumOfSubArrays(int[] numbers) {
		
		int maxSumOfSubArray = Integer.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i; j < numbers.length; j++) {
				
				int currentSum = 0;
				for (int k = i; k <= j; k++) {
					currentSum += numbers[k];
				}
				if (currentSum > maxSumOfSubArray)
					maxSumOfSubArray = currentSum;
			}
		}
		System.out.println("maxSumOfSubArray = "+maxSumOfSubArray);
	}
	
	
	public static void main(String[] args) {
		
		int nums[] = {-2, 5, -9, 6, -1, 7};
		sumOfSubArrays(nums);
		
	}

}
