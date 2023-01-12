package arrays_programs;

public class SumOfSubArrays_n2 {

	public static int sumOfSubArrays(int[] num) {
		
		int maxSum = Integer.MIN_VALUE;
		int[] prefix = new int[num.length];
		
		// Sum at 0th Index
		prefix[0] = num[0];
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i-1] + num[i]; // Formula to get Prefix array
		}
		
		for (int i = 0; i < num.length; i++) {
			int start = i;
			int currentSum = 0;
			for (int j = i; j < prefix.length; j++) {
				int end = j;
				currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
				//  
			}
			if (currentSum > maxSum)
				maxSum = currentSum;
		}
//		System.out.println("Maximum sum="+maxSum);
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {1, -2, 6, -1, 3};
		System.out.println("Max sum of sub array = "+sumOfSubArrays(numbers));
		
	}
}
