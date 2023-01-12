package practice_programs;

public class MultiplicationTable {
	
	public static void multiplicationTable(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d %d = %d%n",number,i,number*i);
		}
	}

	public static void main(String[] args) {
		multiplicationTable(10);
	}

}
