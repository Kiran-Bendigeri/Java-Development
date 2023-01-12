package practice_programs;

import java.util.Scanner;

public class SpyNumber {

	// Find the Spy number (product and sum of each digit in a number will be equal)
	public static boolean isSpyNumber(int num) {
		int myNumber = num;
		int sum = 0;
		int prod = 1;

		while (myNumber > 0) {
			int lastDigit = myNumber % 10;
			sum += lastDigit;
			prod *= lastDigit;
			myNumber /= 10;
		}

		if (sum == prod)
			return true;
		else
			return false;
	}

	// Find the Spy numbers in range
	public static void rangeOfSpyNumbers(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			if (isSpyNumber(i))
				System.out.println("Spy number : " + i);
		}
	}

	// Find the perfect number
	public static boolean isPerfect(int num) {

		int sumOfFactors = 0;
		for (int i = 1; i <= num / 2; i++) { // reduced time complexity by 50%
			if (num % i == 0)
				sumOfFactors += i;
		}
		if (sumOfFactors == num)
			return true;
		else
			return false;
	}

	// find the perfect number for the given range
	public static void perfectNumber(int num1, int num2) {

		for (int i = num1; i <= num2; i++) {
			if (isPerfect(i))
				System.out.println("Perfect number : " + i);
		}
	}

	// Integer palindrome
	public static boolean isPalindrome(int num) {
		int myNumber = num;
		int rev = 0;
		while (myNumber > 0) {
			int lastDigit = myNumber % 10;
			rev = (rev * 10) + lastDigit;
			myNumber /= 10;
		}
		if (rev == num)
			return true;
		else
			return false;
	}

	// Sum of first and Last Digit
	public static int sumOfFirstAndLast(int num) {
		int sum = 0;
		sum = num % 10;
		int myNumber = num;

		while (myNumber > 0) {
			if (myNumber <= 9)
				sum += myNumber;
			myNumber /= 10;
		}
		return sum;
	}
	
	public static void XylemOrPhloem(int num) {
		int myNumber = num;
		int sum1 = num%10;
		int sum2 = 0;
		myNumber /= 10;
		while (myNumber>0) {
			if (myNumber < 10)
				sum1 += myNumber;
			else sum2 += myNumber%10;
			
			myNumber /=10;
		}
		System.out.println("Sum of first and Last digit : "+sum1);
		
		if (sum1==sum2)
			System.out.println("Xylem number");
		else
			System.out.println("Not Xylem number");
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		System.out.println(isSpyNumber(scn.nextInt()));
//		rangeOfSpyNumbers(scn.nextInt(), scn.nextInt());
//		System.out.println(isPerfect(6));
//		perfectNumber(1, 100);
//		System.out.println(isPalindrome(scn.nextInt()));
//		System.out.println(sumOfFirstAndLast(123456789));
		XylemOrPhloem(121);
		scn.close();

	}

}
