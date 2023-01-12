package arrays_programs;

public class ReverseAnArray {
	
	public static void reverseAnArray(int[] array) {
		int startIndex = 0, endIndex = array.length-1;
		
		while(startIndex < endIndex) {
			int temp = array[endIndex];
			array[endIndex] = array[startIndex];
			array[startIndex] = temp;
			
			startIndex++;
			endIndex--;
		}
	}

	public static void main(String[] args) {
		
		int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		reverseAnArray(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}

	}

}
