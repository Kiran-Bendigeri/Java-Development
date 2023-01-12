package string_programs;

import java.util.Arrays;

public class StringAnagram {
	
	/*
	 * Question : Determine if 2 Strings are anagrams of each other.
		
	   What are anagrams?
	   If two strings contain the same characters but in a different order, they can be said to be
	   anagrams. Consider race and care. In this case, race's characters can be formed into a study,
	   or care's characters can be formed into race. Below is a java program to check if two strings
	   are anagrams or not.

	 */
	
	public static boolean isAnagram(String str1, String str2) {
		
		String st1 = str1.toLowerCase();
		String st2 = str2.toLowerCase();
		
		if(st1.length()==st2.length()) {
			
			char[] ch1 = st1.toCharArray();
			char[] ch2 = st2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				return true;
				
			} else return false;
			
		}else return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("race", "care"));
	}

}
