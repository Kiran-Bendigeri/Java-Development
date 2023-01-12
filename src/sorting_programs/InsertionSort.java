package sorting_programs;

public class InsertionSort {
	
	public static void insertionSort(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			int prev = i-1;
			while(prev>=0 && nums[prev]>current) {
				nums[prev+1] = nums[prev];
				prev--;
			}
			nums[prev+1] = current;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 9, 4, 0, 1, 6};
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
