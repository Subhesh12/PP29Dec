package Arrays2;

public class Sliding_window_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	   public int[] maxSlidingWindow(int[] nums, int k) {
	        int[] leftmax = new int[nums.length];
			int[] rightmax = new int[nums.length];

			leftmax[0] = nums[0];
			rightmax[nums.length - 1] = nums[nums.length - 1];

			for (int i = 1; i < nums.length; i++) {
				leftmax[i] = (i % k == 0) ? nums[i] : Math.max(leftmax[i - 1], nums[i]);

				int j = nums.length - i - 1;
				rightmax[j] = (j % k == 0) ? nums[j] : Math.max(rightmax[j + 1], nums[j]);
			}

			int[] sliding_max = new int[nums.length - k + 1];
			for (int i = 0, j = 0; i + k <= nums.length; i++) {
				sliding_max[j++] = Math.max(rightmax[i], leftmax[i + k - 1]);
			}

			return sliding_max;
	    }

}
