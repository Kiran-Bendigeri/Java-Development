package practice_programs;

public class ArrowHeadPattern {

	public static void arrowHead(int rows) {
		int col = (2 * rows) - 1;

		for (int i = 1; i <= rows; i++) {
			// stars
			for (int j = 1; j <= col; j++) {
				if (j==i || (j == (col-i+1))) {
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		arrowHead(5);
	}

}
