package arrays_programs;

public class FindKeyInSortedArray {
	
	public static boolean findKey(int[][] nums, int key) {
		// set the row and column for pivot point
		int row = nums.length-1, col = 0;
		
		while (row >= 0 && col < nums[0].length) {
			
			if(nums[row][col]==key) {
				System.out.println("Key found at (row:" + row + ",col:" + col +")");
				return true;
			}
			else if(nums[row][col] < key)
				col++;
			else row--;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] nums = {
						{1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12},
						{13, 14, 15, 16}
						};
		
		findKey(nums, 13);
	}

}
