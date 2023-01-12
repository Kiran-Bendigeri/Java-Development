package practice_programs;

public class ArmstrongNumber {
	
	public static boolean isArmstrong(int number) {
		
		if (number==0 || number ==1)
			return true;
		
		int myNumber = number;
		int sum = 0;
		while(myNumber>0) {
			int lastDegit = myNumber % 10;
			int product = (int)Math.pow(lastDegit, 3);
			sum = sum+product;
			myNumber /= 10;
		}
		if (sum==number)
			return true;
		else 
			return false;
	}
	
	// VarArgs
	public static void armStrong(int... numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (isArmstrong(numbers[i]))
					System.out.print("Armstrong number = "+numbers[i]+" ");
			else continue;
		}
	}

	public static void main(String[] args) {
		
		armStrong(12, 154, 153, 202, 159, 687, 485);
	}

}
