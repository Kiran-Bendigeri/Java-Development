package practice_programs;

public class InvertedHalfPyramidWithNumbers {

	public static void main(String[] args) {
		
		int rowOrCol = 5;
		
		for (int i = 1; i <= rowOrCol; i++) {
			
			for (int j = 1; j <= rowOrCol; j++) {
				
				if (j<=(rowOrCol-i+1)) {
					System.out.print(j);
				}
				else {continue;}
				
			}
			System.out.println();	
		}
	}
}

								/*
								
								12345
								1234
								123
								12
								1
								 
								*/
