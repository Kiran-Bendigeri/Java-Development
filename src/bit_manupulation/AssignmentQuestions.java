package bit_manupulation;

public class AssignmentQuestions {
	
	public static void swap2Nums(int a, int b) {
		int n1=a;
		int n2=b;
		
//		n1 = n1+n2;
//		n2 = n1 - n2;
//		n1 = n1 - n2;
//		System.out.println("n1="+n1+" n2="+n2);
		
		// XOR^ operates like 1,1 = 0 | 1,0 = 1 | 0,0 = 0 | 0,1 = 1 for identical elements=0
		n1 = n1^n2;
		n2 = n1^n2;
		n1 = n1^n2;
		System.out.println("n1="+n1+" n2="+n2);
	}

	public static int addOneToInteger(int num) {
		int bitMaskVal = ~((~0)<<1);
		return num+bitMaskVal;
	}
	
	public static void upperToLower() {
		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.println((char)(ch | ' '));
		}
	}
	
	public static void main(String[] args) {
//		swap2Nums(2, 10);
//		System.out.println(addOneToInteger(347));
//		upperToLower();
		
		char ch = 194;
		System.out.println();
	}

}
