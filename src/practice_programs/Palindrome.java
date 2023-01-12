package practice_programs;

import java.util.*;

public class Palindrome {
	
	public static boolean palindrome(int num) {
		
		int n = num;
		int rev = 0;
		
		do {
			int lastDegit = n%10;
			rev = (rev*10)+lastDegit;
			n = n/10;
		}while(n>0);
		
		if (rev == num) {
			return true;
		}else {return false;}
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number to check Palindrome : ");
		
		System.out.println(palindrome(scn.nextInt()));
		scn.close();
		
	}

}