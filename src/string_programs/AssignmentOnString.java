package string_programs;

import java.util.*;;

public class AssignmentOnString {
	
	/*
	 * Count how many times lower case vowels occurred in a String entered by the user
	 */
	
	public static int countOfVowels(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			switch(str.charAt(i)) {
			
			case ('a'):
			case ('e'):
			case ('i'):
			case ('o'):
			case ('u'):count++;
						break;
			}
		}
		return count;
	}
	
	/*
	 * Question :Determine if 2 Strings areanagramsof each other.
	 * 
	 * What are anagrams?If two strings contain the same characters but in a different order,
	 * they can be said to be anagrams.Consider race and care.In this case,
	 * race's characters can be formed into a study,or care's characters can be formed into race.
	 * Below is a java program to check if two strings are anagrams or not.
	 */
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value : ");
		System.out.println("Vowel count in string = " + countOfVowels(scn.nextLine()));
		System.out.println("Vowel count in string = " + countOfVowels("Java is oo principle language"));
		
		String name = "race";
		
		for (int i = 0; i < name.length(); i++) {
			
//			name.co
			
		}
	}
}
