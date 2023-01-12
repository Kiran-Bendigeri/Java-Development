package practice_programs;

public class BinaryToDecimal {
	
	public static void binToDecimal(int binNum) {
		int myNumber = binNum;
		int decimal = 0;
		int pow = 0;
		
		while (myNumber>0) {
			int lastDegit = myNumber % 10;
			decimal = decimal +  lastDegit * (int)Math.pow(2, pow);
			pow++;
			myNumber = myNumber/10;
		}
		System.out.println("Binary To Decimal Conversion\n"+binNum+" --> "+ decimal);
	}

	public static void main(String[] args) {
		binToDecimal(11100011);
	}

}
