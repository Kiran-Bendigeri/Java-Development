package string_programs;

public class StringPalindrome {
	
	// O(n)
	public static boolean isStringPalindrome(String element) {
		
		for (int i = 0; i < element.length()/2; i++) {
			if(element.charAt(i) != element.charAt(element.length()-1-i))
				return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		String[] obj = {"racecar", "SAAS", "noon", "madam", "Hello"};
		for (int i = 0; i < obj.length; i++) {
			System.out.println("Palindrome : "+isStringPalindrome(obj[i]));
		}	
	}
}
