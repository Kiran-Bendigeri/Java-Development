package arrays_programs;
/*
 * Formula to calculate the number of pairs in the given array
 * 
 * 				TotalPairs = n*(n-1) / 2
 * 
 * 
 * Condition -> Neglecting already paired numbers
 * Ex : if 1,2 pair is done
 * 		Neglecting 2,1 pair
 */

public class NumberOfPairs {

	public static int totalNumberOfPairs(int[] num) {
		int pairs = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				System.out.print(num[i] + "," + num[j] + " | ");
				pairs++;
			}
			System.out.println();
			System.out.println("--------------------------------------------------------");
		}
		return pairs;
	}

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 8, 7, 0, 5, 6, 7, 2, 90 };
		System.out.println(totalNumberOfPairs(numbers));

	}

}
