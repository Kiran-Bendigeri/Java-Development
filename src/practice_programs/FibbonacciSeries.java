package practice_programs;

public class FibbonacciSeries {
	
	static int k,num1,num2=1;
	
	static void fibbonacciSeries(int num) {
		
		System.out.printf("%-2s",num1);
		
		for (int i = 1; i <= num; i++) {
			k = num1+num2;
			System.out.print(k+" ");
			num1=num2;
			num2 = k;
		}
	}
	public static void main(String[] args) {
		fibbonacciSeries(5);
	}

}
