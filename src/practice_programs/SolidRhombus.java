package practice_programs;

public class SolidRhombus {

	static void SolidRhobus(int n) {

		// Outer loop
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= (n - i))
					System.out.print(' ');
			}

			for (int j = 1; j <= n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	static void HollowRhobus(int n) {

		// Outer loop
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j <= (n - i))
					System.out.print(' ');
			}

			for (int j = 1; j <= n; j++) {
				if (i==1 || j==1 || i==n || j==n)
					System.out.print("*");
				else System.out.print(" ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		SolidRhobus(5);
		HollowRhobus(5);

	}

}
