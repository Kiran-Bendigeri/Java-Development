package practice_programs;

public class HollowRectanglePattern {

	public static void main(String[] args) {
		
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				
				if(i==1 || j==1 || i == 5 || j==5) {
					System.out.print("*");
				}else {System.out.print(' ');}
				
			}
			System.out.println();
		}

	}

}
