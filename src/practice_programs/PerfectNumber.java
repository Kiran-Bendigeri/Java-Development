package practice_programs;

public class PerfectNumber {
	
	static int  sum;
	
	public static boolean isPerfectNumber(int number) {
		
		for (int i = 1; i <= number/2; i++) {
			if(number%i==0) {
				sum = sum+i;
				System.out.print(i+" ");
			}
		}
		
		if (sum==number) {
			
			return true;
		}else {return false;}
	}

	public static void main(String[] args) {
		boolean status = isPerfectNumber(8128);
		System.out.println();
		System.out.println("sum="+sum);
		if (status)
			System.out.println("Perfect Number");
		else
			System.out.println("Not perfect number");

	}

}
