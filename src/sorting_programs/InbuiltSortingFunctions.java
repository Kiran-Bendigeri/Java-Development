package sorting_programs;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortingFunctions {
	
	public static void main(String[] args) {
		Integer array[] = {9, 3, 6, 7, 1, 5, 11, 8};
		Arrays.sort(array, 3, 6);
		
		int n = array.length-1;
		
		Arrays.sort(array,0, n, Collections.reverseOrder());
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
