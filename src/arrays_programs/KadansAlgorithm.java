package arrays_programs;

/*
 * This "Kadans algorithm" is suitable only when an arrays consisting  only positive integer or 
 * both positive and negative values.
 * 
 * NOTE -> If the case when an array contains all negative values the result will be '0'
 * 			
 * 			In this case we can traverse the given array to check all are negative
 * 			and can return smallest negative number.(This is the max sum of sub array)
 */

public class KadansAlgorithm {

	public static int maxSumofSubArray(int[] numbers) {

		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i = 0; i < numbers.length; i++) {
			currentSum = currentSum + numbers[i];
			
			if (currentSum<0)
				currentSum = 0;
			else
				maxSum = Math.max(maxSum, currentSum);
			
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
//		int[] nums = { 2, 3, 4, 1, 2, 1, 5, 3 };
		System.out.println(maxSumofSubArray(nums));
	}

}
