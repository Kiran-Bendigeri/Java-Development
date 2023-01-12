package practice_programs;

public class InvertedStarPattern {

	public static void main(String[] args) {
		int rowOrCol = 4;
		
		for (int i = 1; i <= rowOrCol; i++) {
			
			for (int j = 1; j <= rowOrCol-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
/*
				j=

			0 1 2 3
		0	* * * *
   i=	1	* * *		Formula :- i+j < rowOrCol
		2	* *						or
		3	*						rowOrCol-i+1
						------------
 */
