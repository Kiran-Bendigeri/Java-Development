package arrays_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Triplets {

	// Brute Force Method
	public static List triplet(int[] nums) {

		boolean check = constrintCheck(nums);
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		if (check) {

			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					for (int k = j + 1; k < nums.length; k++) {
						if (nums[i] + nums[j] + nums[k] == 0) {
							ArrayList<Integer> triplet = new ArrayList<Integer>();
							triplet.add(nums[i]);
							triplet.add(nums[j]);
							triplet.add(nums[k]);
							// performing sorting to each array to see presence of identical sub arrays
							Collections.sort(triplet);
							// Adding sorted sub array into arrayList
							result.add(triplet);
						}
					}
				}

			}
			// Converting sub arrays type from Arraylist to LinkedHashSet to filter
			// duplicate sub arrays
			LinkedHashSet<List<Integer>> set = new LinkedHashSet<List<Integer>>(result);
			// saving final result in ArrayList
			result = new ArrayList(set);
		}
		return result;
	}

	public static boolean constrintCheck(int[] nums) {
		if (nums.length > 0 && nums.length <= 3000) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] < (int) Math.pow(-10, 5) && nums[i] > (int) Math.pow(10, 5)) {
					return false;
				}
			}
		} else
			return false;

		return true;
	}

	public static void main(String[] args) {
		int array[] = { -1, 0, 1, 2, -1, -4 };
		System.out.println(triplet(array));
	}

}
