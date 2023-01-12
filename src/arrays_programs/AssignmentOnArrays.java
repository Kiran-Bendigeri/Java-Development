package arrays_programs;

public class AssignmentOnArrays {

	/*
	 * Question #1 Given an integer array nums, return true if any value appears at
	 * least twice in the array, and return false if every element is distinct.
	 * 
	 * Constraints : 1 <= nums.lengtth <= 10^5 -10^9 <= nums[i] <= 10^9
	 * 
	 * Ex : Input: nums = [1, 2, 3, 1] Output: true
	 */

	public static boolean constraintsCheck(int[] nums) {
		// constraints check
		// Assuming constraints are not matching.
		boolean check = false;

		if (nums.length >= 1 && nums.length <= Math.pow(10, 5)) {

			for (int i = 0; i < nums.length; i++) {

				if (nums[i] >= Math.pow(-10, 9) && nums[i] <= Math.pow(10, 9)) {
					if (check == false)
						check = true;
				} else {
					check = false;
					System.out.println("Number is out of range =" + nums[i] + " index=" + i);
					break;
				}
			}
		} else {
			throw new ArrayStoreException();
		}
		return check;
	}

	public static boolean duplicateVal(int[] nums) {

		boolean check = constraintsCheck(nums);
		// check duplicate values
		// assuming all values are unique

		if (check) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {

					if (nums[i] == nums[j]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/*
	 * Question #2 There is an integer array nums sorted in ascending order (with
	 * distinct values). Prior to being passed to your function, nums is possibly
	 * rotated at an unknown pivot index k (1 <= k < nums.length) such that the
	 * resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0],
	 * nums[1],...,nums[k-1]] (0-indexed).
	 * 
	 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become
	 * [4,5,6,7,0,1,2]. Given the array nums after the possible rotation and an
	 * integer target, return the index of target if it is in nums, or -1 if it is
	 * not in nums.
	 * 
	 * --> You must write an algorithm with O(log n) runtime complexity.
	 * 
	 * Constraints: -> 1 <= nums . lengtth <= 5000 -> -10^4 <= nums[i] <= 10^4 ->
	 * All values of nums are unique. -> nums is an ascending array that is possibly
	 * rotated.
	 */

	public static void findKey(int nums[], int key) {

		if (nums.length >= 1 && nums.length <= 5000) {

		}

	}

	/*
	 * Question #3
	 * 
	 * 
	 */

	public static int maxProfit(int[] price) {

		// Constraints check
		boolean status = true;
		if (price.length > 0 && price.length <= Math.pow(10, 5)) {

			for (int i = 0; i < price.length; i++) {
				if (price[i] <= 0 || price[i] > (int) Math.pow(10, 5)) {
					status = false;
					break;
				}
			}
		}
		// ---------------------------------------------------------------------------------

		// Maximum profit
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0; // Global profit
		if (status) {

			for (int i = 0; i < price.length; i++) {

				if (buyPrice < price[i]) {
					int profit = price[i] - buyPrice; // current profit
					maxProfit = Math.max(maxProfit, profit);
				} else
					buyPrice = price[i];
			}
		}
		return maxProfit;

	}

	public static void main(String[] args) {
//		int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//		int nums[] = {1, 2, 3, 4};
//		System.out.println(duplicateVal(nums));
		int price[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Maximum profit is " + maxProfit(price));

	}

}
