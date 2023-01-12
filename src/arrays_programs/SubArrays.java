package arrays_programs;

public class SubArrays {
	
	public static void maxSubArraysSum(int numbers[]) {
		
		int total_subarrays = 0;
		int currentSum = 0;
		int maxValue = Integer.MIN_VALUE;
		// Outer loop to get the start value
		for (int i = 0; i < numbers.length; i++) {
			int start = i;
			
			// 1st inner loop to get the end vlaue
			for (int j = i; j < numbers.length; j++) {
				int end = j;
				currentSum = 0;
				// 2nd inner loop to calculate to get pairs of sub arrays
				for (int k = start; k <= end; k++) {
					System.out.print(numbers[k]+" ");
					currentSum +=numbers[k];
				}
//				System.out.println(currentSum);
				System.out.println();
				total_subarrays++;
				if (maxValue < currentSum)
					maxValue = currentSum;
			}
			System.out.println();
		}
		System.out.println("Total subarrays : "+total_subarrays);
		System.out.println("Maximum sum of sub arrays : "+maxValue);
	}

	public static void main(String[] args) {
		int n[] = {1, -2, -6, -1, 3};
		maxSubArraysSum(n);
	}
	
	/* NOTE :
	 * Time complexity is O(n^3) which is bad.
	 * Because 3 nested loops have been used and each loop traversing from 0 to n.
	 * This method also known as BruteForce or basic method to find the maximum sum of sub arrays.
	 * 
	 */
	
	/*
	 * To calculate the number of sub arrays that can be existed for the given "n" length of array
	 * 
	 * We can use the Formula i.e 
	 *  							n*(n+1)/2
	 *  							---------
	 */

}
