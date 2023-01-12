package arrays_programs;

public class MaxStockProfit {
	
	public static void maxStockProfit(int nums[]) {
		
		int buyPrice = nums[0];
		int maxProfit = Integer.MIN_VALUE;
		
		for (int i = 1; i < nums.length; i++) {
			
			if(buyPrice < nums[i]) {
				int currentProfit = nums[i] - buyPrice;
				maxProfit = Math.max(maxProfit, currentProfit);
			}
			else buyPrice = nums[i];
				
		}
		System.out.println("Max stock profit : " + maxProfit);
	}

	public static void main(String[] args) {
		int[] nums = {7, 1, 5, 3, 6, 4};
		maxStockProfit(nums);
	}

}
