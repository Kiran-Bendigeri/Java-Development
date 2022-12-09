package arrays_programs;

public class BinarySearch {
	
	/*
	 * In order to perform the Binary Search the prerequisite is that
	 * 
	 * 		NOTE : ARRAY MUST BE SAVED BEFORE IN SORTED FORMAT
	 */
	
	public static int binarySearch(int numbers[], int key) {
		int start = 0, end = numbers.length-1;
		
		while (start <= end) {
			int mid = (start + end)/2;
			
			if (numbers[mid] == key) {
				return mid;
			}
			if (numbers[mid] < key) { // right
				start = mid+1;
			}
			else {// left
				end = mid-1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = {1, 2, 4, 6, 8, 9, 11, 12, 13, 15, 16, 18};
		int key = 6;
		System.out.println("index for key is : "+binarySearch(nums, key));
	}

}
