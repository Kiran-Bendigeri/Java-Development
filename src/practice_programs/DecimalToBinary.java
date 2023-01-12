package practice_programs;

public class DecimalToBinary {
	
	public static void decToBinary(int Deci) {
		int myNum = Deci;
		StringBuffer binaryForm = new StringBuffer();
		
		while(myNum>0) {
			binaryForm = binaryForm.append(myNum%2);
			myNum = myNum/2;
		}
		System.out.println("Decimal To Binary Conversion\n"+Deci+" --> "+binaryForm.reverse());
	}
	
	public static void decimalToBinary(int Deci) {
		int myNumber = Deci;
		int pow = 0;
		int bin = 0;
		while(myNumber > 0) {
			int lastDegit = myNumber%2;
			bin = bin + lastDegit * (int)Math.pow(10, pow);
			pow++;
			myNumber = myNumber/2;
			}
		System.out.println("Decimal To Binary conversion\n"+Deci+" --> "+bin);
	}

	public static void main(String[] args) {
//		DecimalToBinary.decToBinary(100);
		decimalToBinary(227);
	}

}
