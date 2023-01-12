package practice_programs;

public class FactorialCalculation {
	
	public static long factorialCalculation(int number) {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println(factorialCalculation(20));

	}

}
