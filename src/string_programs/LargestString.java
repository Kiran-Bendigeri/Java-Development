package string_programs;

public class LargestString {
	
	public static String largestString(String fruits[]) {
		String largest = "";
		for (int i = 0; i < fruits.length; i++) {
			if(largest.compareTo(fruits[i])<0)
				largest = fruits[i];
		}
		
		return largest;
	}
	
	public static String initialLetterCapital(String str) {
		
		StringBuilder sb = new StringBuilder("");
		sb.append(Character.toUpperCase(str.charAt(0)));
		
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == ' ' && i < str.length()) {
				sb.append(str.charAt(i));
				i++;
				
				char ch = Character.toUpperCase(str.charAt(i));
				sb.append(ch);
			}else sb.append(str.charAt(i));
		}
		return sb.toString().concat("Hello there").indent(15).strip();
	}
	
	public static void main(String[] args) {
		
		String[] fruits = {"apple", "mango", "lemon"};
		System.out.println(largestString(fruits));
		
		String obj = "Hi! there, i am kiran bendigeri";
//		System.out.println(initialLetterCapital(obj));
	}

}
