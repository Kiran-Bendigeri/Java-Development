package practice_programs;

public class InvertedRotatedHalfPyramid {

	public static void main(String[] args) {
		
		int rowOrCol = 5;
		
		for (int i = 1; i <= rowOrCol; i++) {
			
			for (int j = 1; j <= rowOrCol; j++) {
				
				if (j>(rowOrCol-i)) {
					System.out.print('*');
				}
				else {System.out.print(' ');}
				
			}
			System.out.println();
		}

	}

}

							/*
							
							*
							**
							***
							****
							*****
							
							*/
