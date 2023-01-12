package arrays_programs;

import static java.lang.System.out;

public class _2DArrayAssignment {
	
	// O(n2)
	public static void printTheNumber(int[][] nums, int key) {
		
		int count=0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if(nums[i][j]==key)
					count++;
			}
		}
		if(count>0)
		out.println("Count of key : " + count);
		else out.println("Key not Found");
	}
	
//------------------------------------------------------------------------------------------------------	
	
	public static void printTheSumOfNumber(int[][] array) {
		int row = 1;
		
		int sum=0;
		
		for (int i = 0; i < array[row].length; i++) {
			sum += array[row][i];
		}
		
		out.println("Sum of 2nd row : " + sum);
	}
	
//------------------------------------------------------------------------------------------------------	
	
	/*
	 *  transpose the given matrix
	 *  means
	 *  N*M = 2*3
	 *  Ans -> N*M = 3*2
	 */
	
	public static void transposeMatrix(int[][] array) {
		int row = array.length, col = array[0].length;
		
		int transpose[][] = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transpose[j][i] = array[i][j];
			}
		}
		
		printArray(transpose);
	}
	
	public static void printArray(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				out.print(array[i][j]);
			}
			out.println();
		}
	}
	
//------------------------------------------------------------------------------------------------------	
	public static void main(String[] args) {
		int[][] array = {
							{4, 7, 8},
							{8, 8, 7}
						};
		
		int key = 0;
//		printTheNumber(array, key);
		
		int[][] nums = { 
						{1, 4, 9},
						{11, 4, 3},
						{2, 2, 3}
						};
//		printTheSumOfNumber(nums);
		
		int[][] matrix = {
							{1, 2, 3},
							{4, 5, 6}
						};
		
		transposeMatrix(matrix);
	}

}
