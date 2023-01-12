package practice_programs;

public class PatternProblems {
	
	public static void inverted_half_pyramid_with_numbers(int rows) {
		// outer loop
		for (int i = 1; i <= rows; i++) {
			//inner loop
			for (int j = 1; j <= rows-i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();			
		}
	}
	
	public static void floyds_triangle(int n) {
		// outer loop
		int num = 1;
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-3s",num);
				num++;
			}
			System.out.println();
		}
	}

	public static void triangle0_1(int n){
		int counter = 1;
		// outer loop --> rows
		for (int i = 1; i <= n; i++) {
			// inner loop --> column
			for (int j = 1; j <= i; j++) {
				
				System.out.print(counter);
				if (counter==1)
				counter--;
				else counter++;
			}
			System.out.println();
		}
	}
	
	public static void zero_one_triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i+j)%2==0)
					System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();			
		}
	}

	public static void main(String[] args) {
//		 inverted_half_pyramid_with_numbers(5);
//		 floyds_triangle(5);
//		triangle0_1(5);
//		zero_one_triangle(5);
	}

}
