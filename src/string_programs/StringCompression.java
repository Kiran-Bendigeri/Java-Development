package string_programs;

public class StringCompression {
	
	public static String stringCompression(String str) {
		
		StringBuilder SBuilder = new StringBuilder("");
		
		for (int i = 0; i < str.length(); i++) {
			Integer count = 1;
			while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			
			SBuilder.append(str.charAt(i));
			if(count>1)
				SBuilder.append(count);
		}
		
		return SBuilder.toString();
	}
	
	public static void main(String[] args) {
		String str = "aaadddvvvvgggeeeey";
		System.out.println(stringCompression(str));
	}

}
