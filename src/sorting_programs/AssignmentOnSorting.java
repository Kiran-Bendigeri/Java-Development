package sorting_programs;

/*
 * Time complexity is O(n2) for (Bubble, Selection, Insertion and Counting sorting algorithms)
 * -------------------------------------------------------------------------------------------
 */

public class AssignmentOnSorting {
	
	public static void bubbleSorting(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]<array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[min]<array[j]) {
					min = j;
				} 
			}
			//swap
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
	
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void insertionSorting(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int previous = i-1;
			while(previous>=0 && array[previous]<current) {
				 array[previous+1]=array[previous];
				previous--;
			}
			array[previous+1] = current;
		}
	}
	
	public static void countingSort(int array[]) {
		int largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			largest = Math.max(largest, array[i]);
		}
		
		int auxilary[] = new int[largest+1];
		
		for (int i = 0; i < array.length; i++) {
			auxilary[array[i]]++;
		}
		
		int j = 0;
		for (int i = 0; i < auxilary.length; i++) {
			
			while(auxilary[i]>0) {
				array[j] = i;
				j++;
				auxilary[i]--;
			}
		}
	}

	public static void main(String[] args) {
		int array[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//		bubbleSorting(array);
//		selectionSort(array);
//		insertionSorting(array);
		countingSort(array);
		printArray(array);
	}

}
