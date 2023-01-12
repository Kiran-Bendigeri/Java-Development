package practice_programs;

public class SumOfOddEven {
	
	public static void sumOfOddEven(int num) {
		int sumOfOdd = 0;
		int sumOfEven = 0;
		
		for (int i = 1; i <= num;i++) {
			
			if (i % 2 == 0) {
				sumOfEven = sumOfEven + i;
			}
			else {
				sumOfOdd = sumOfOdd +i;
			}
		}
		
		System.out.println("Sum of ODD numbers = "+sumOfOdd);
		System.out.println("Sum of EVEN numbers = "+sumOfEven);
	}

	public static void main(String[] args) {
		sumOfOddEven(10);
	}

}
