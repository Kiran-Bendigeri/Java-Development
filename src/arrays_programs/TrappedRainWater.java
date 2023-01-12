package arrays_programs;

public class TrappedRainWater {
	
	public static int trappedWater(int[] height) {
		int n = height.length;
		
		// Left max boundry
		int[] leftmax = new int[n];
		leftmax[0] = height[0];
		
		// calculate left max boundry
		for (int i = 1; i < n; i++) {
			leftmax[i] = Math.max(leftmax[i-1], height[i]);
		}
		
		// Right max boundry
		int[] rightmax = new int[n];
		rightmax[n-1] = height[n-1];
		
		// calculate right max boundry
		for (int i = n-2; i >= 0 ; i--) {
			rightmax[i] = Math.max(rightmax[i+1], height[i]);
		}
		
		// trapped water
		int trappedWater = 0;
		for (int i = 0; i < n; i++) {
			int waterlevel = Math.min(rightmax[i], leftmax[i]);
			trappedWater += waterlevel - height[i];
		}
		return trappedWater;
	}

	public static void main(String[] args) {
		
		int height[] = {4, 2, 0, 6, 3, 2, 5};
		System.out.println("Trapped rain water"+trappedWater(height));

	}

}
