package practice_programs;

import java.util.Scanner;

public class ReversedNumber {
	
	public static void reverse(int num) {
		
		int n = num;
		int reversed = 0;
		
		while(n > 0) {
			int lastDegit = n % 10;
			reversed=(reversed*10)+lastDegit;
			n=n/10;
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner scn = new Scanner(System.in);
		reverse(scn.nextInt());
		scn.close();
	}
}
