package sorting_programs;

public class MergeSort {

	public static void conqure(int arr[], int start, int mid, int end) {
		int merged[] = new int[end-start +1];

		int index1 = start;
		int index2 = mid+1;
		int x = 0;

		while (index1 <= mid && index2 <= end) {
			if (arr[index1] <= arr[index2]) {
				merged[x++] = arr[index1++];
			} else
				merged[x++] = arr[index2++];
		}
		while (index1 <= mid) {
			merged[x++] = arr[index1++];
		}
		while (index2 <= end) {
			merged[x++] = arr[index2++];
		}
		
		for (int i = 0, j=start; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}

	}

	public static void divide(int arr[], int start, int end) {

		if (start >= end) {
			return;
		}

		int mid = start + (end-start)/2;

		divide(arr, start, mid);
		divide(arr, mid+1, end);
		conqure(arr, start, mid, end);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 8, 6, 1, 7, 8, 10, 4 };
		divide(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
