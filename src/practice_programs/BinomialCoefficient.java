package practice_programs;

/*
 * Formula to find BinomialCoefficient
 * 
 * 			nCr = n!/r!*(n-r)!
 */

public class BinomialCoefficient {
	
	// Method to get the factorial of given number
	public static int factorial(int num) {
		int factorial=1;
		
		for (int i = 1; i <= num; i++) {
			factorial = factorial*i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// n=4, r=5
		int n = 15, r=5;
		float n_factorial = factorial(n);
		float r_factorial = factorial(r);
		float n_r_factorial = factorial(n-r);
		
		System.out.println("n_factorial = "+n_factorial);
		System.out.println("r_factorial = "+r_factorial);
		System.out.println("n_r_factorial = "+n_r_factorial);
		
		long res = (long) (n_factorial / r_factorial * n_r_factorial);
		System.out.println(res);
	}

}
