package practice_programs;

public class OptimizedPrimeChecker {
	
	public static boolean isPrime(int num) {
		// Corner case/Special Case
		if (num == 2) {
			return true;
		}
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	// To check prime number for Given range
	
	public static void primeChecker(int range) {
		System.out.println("Prime numbers witin the given range.");
		for (int i = 2; i <= range; i++) {
			if (OptimizedPrimeChecker.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number : ");
//		System.out.println(isPrime(sc.nextInt()));
		primeChecker(20);
	}

}
