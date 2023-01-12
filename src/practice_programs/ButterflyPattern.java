package practice_programs;

public class ButterflyPattern {
	
	public static void butterfly(int row) {
		
		int Col = row*2;
		
		// Outer loop
		for (int i = 1; i <= row; i++) {
			// Inner loop
			for (int j = 1; j <= Col; j++) {
				if (i >= j || j > (Col - i))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
		// Outer loop
		for (int i = row; i >= 1; i--) {
			// Inner loop
			for (int j = Col; j >= 1; j--) {
				if (i >= j || j > (Col - i))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		butterfly(20);
	}

}
