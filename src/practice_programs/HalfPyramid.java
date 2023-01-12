package practice_programs;

public class HalfPyramid {

	public static void main(String[] args) {
		int roOrCol = 4;
		
//		for (int i = 0; i < roOrCol; i++) {
//			int num = 1;
//			for (int j = 0; j < roOrCol; j++) {
//				if (i >= j) {
//					System.out.print(num++);
//				}else {continue;}
//				
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i <= roOrCol; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
