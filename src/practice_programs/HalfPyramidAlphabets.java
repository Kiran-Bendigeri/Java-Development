package practice_programs;

public class HalfPyramidAlphabets {

	public static void main(String[] args) {
		int rowOrCol = 5;
		char ch ='A';
		
		for (int i = 1; i <= rowOrCol; i++) {
			for (int j=1; i >= j; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}

	}

}
