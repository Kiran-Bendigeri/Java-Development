package practice_programs;

public class Delete {
	
	public static boolean isPalindrome(int inputNumber) {
		int myNumber = inputNumber;
		int rev = 0;

		while (myNumber > 0) {
			int lastDegit = myNumber % 10;
			rev = (rev * 10) + lastDegit;
			myNumber /= 10;
		}

		if (rev == inputNumber)
			return true;
		else
			return false;
	}

	public static void palindromeForRange(int start, int end) {
		for (int i = start; i <= end; i++) {

			if (isPalindrome(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {

//		System.out.println(isPalindrome(121));
//		palindromeForRange(100, 1000);

//		int rowOrCol = 215;
//		for (int i = 1; i <= rowOrCol; i++) {
//			int number = 1;
//			for (int j = 0; j < rowOrCol; j++) {
//				if (j <= (rowOrCol-i)) {
//					System.out.print(number + "  ");
//					number++;
//				}else {continue;}
//			}
//			System.out.println();
//		}

	}

}
