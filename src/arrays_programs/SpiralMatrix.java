package arrays_programs;

public class SpiralMatrix {
	
	public static void spiralMatrix(int[][] matrix) {
		int startRow = 0;
		int endRow = matrix.length-1;
		int startColumn = 0;
		int endColumn = matrix[0].length-1;
		
		while(startRow <= endRow && startColumn <= endColumn) {
			
			//top row
			for (int j = startColumn; j <= endColumn; j++) {
				System.out.print(matrix[startRow][j] + " ");				
			}
			
			//right column
			for (int i = startRow+1; i <= endRow; i++) {
				System.out.print(matrix[i][endColumn] + " ");				
			}
			
			//bottom row
			if (startRow==endRow)
				break;
			
			for (int j = endColumn-1; j >= startColumn; j--) {
				System.out.print(matrix[endRow][j] + " ");
			}
			
			//left column
			if (startColumn==endColumn)
				break;
			for (int i = endRow-1; i >= startRow+1; i--) {
				System.out.print(matrix[i][startRow] + " ");
			}
			
			startColumn++;
			endColumn--;
			startRow++;
			endRow--;
			
		}
		System.out.println();
		
		
	}
	
	public static void main(String[] args) {
		int[][] array = {
				
							{1, 2, 3, 4},
							{5, 6, 7, 8},
							{9, 10, 11, 12},
							{13, 14, 15, 16}
				
						};
		
		spiralMatrix(array);
	}
}
