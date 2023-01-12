package practice_programs;

public class HollowRightAngleTriangle {
	
	public static void rightAngleTriangle(int rowsOrCol) {
		
		// outer loop
		for (int i = 1; i <= rowsOrCol; i++) {
			//inner loop
			for (int j = 1; j <= rowsOrCol; j++) {
				if (i==j)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			}
		
	}
//	j==1 || i==rowsOrCol || 
//	public static void arrowHead(int rows)

	public static void main(String[] args) {
		rightAngleTriangle(5);

	}

}
