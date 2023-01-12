package arrays_programs;

import java.util.Scanner;

public class _2DArray {
	
	public static void minAndMaxOf2DArray(int[][] nums, int Min, int Max) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if(nums[i][j]>Max)
				Max=Math.max(nums[i][j], Max);
				if(nums[i][j]<Min)
					Min = Math.min(Min, nums[i][j]);
			}
//			System.out.println();
		}
		System.out.println("Max="+Max+" Min="+Min);
	}
	
	public static void main(String[] args) {
		int nums[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int n = nums.length, m = nums[0].length; 
		
		Scanner scn = new Scanner(System.in);
//		System.out.print("Enter the numbers for the array :");
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[i].length; j++) {
//				nums[i][j] = scn.nextInt();
//			}
//		}
		
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[i].length; j++) {
//				System.out.print(nums[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int Max=Integer.MIN_VALUE;
		int Min=Integer.MAX_VALUE;
		minAndMaxOf2DArray(nums, Min, Max);
		

	}

}
