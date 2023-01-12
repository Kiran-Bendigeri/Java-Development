package practice_programs;

import java.util.*;

public class PrimeNumberLogic {
	
	public static void primeNumberChecker(int number) {
		int num = number;
		
		if (num == 2) {
			System.out.println("is not prime");
		}
		else {
			boolean status = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					status = false;
					break;
				}
			}
			
			if (status == true) {
				System.out.println("is prime");
			}
			else {
				System.out.println("is not prime");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int condition = 1;
		while(condition==1) {
		System.out.print("Enter the number : ");
		primeNumberChecker(sc.nextInt());
		sc.close();
		System.out.println("Want to continue?click = 1 or click = 0");
		condition = sc.nextInt();
		}
	}
}
