package practice_programs;


public class FloydsTriangle {

	public static void main(String[] args) {
		int rowOrCol = 5;
		int num = 1;
		for (int i = 1; i <= rowOrCol; i++) {
			
			for (int j = 1; j <= rowOrCol; j++) {
				
				if (i >= j) {
					System.out.printf("%-3s",num++);
				}
				else {continue;}
			}
			System.out.println();
		}
	}
}
/*

1  
2  3  
4  5  6  
7  8  9  10 
11 12 13 14 15
 
 */