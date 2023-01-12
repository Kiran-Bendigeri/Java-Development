package arrays_programs;

public class SumOfDiagonal {
	
	public static int sumOfDiagonalOf2DArray(int nums[][]) {
		
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i][i];
			
			if (i!= nums[i].length-1-i) {
				sum += nums[i][nums[i].length-i-1];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int nums[][] = {
				
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
								
						};
		System.out.println("Sum of diagonal for the given Matrix = "+sumOfDiagonalOf2DArray(nums));
	}

}
