package Arrays;

public class largest_number_atleast_twice_of_others {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int dominantIndex(int[] nums) {
		int max = -1, index = -1, secmax = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				secmax = max;
				max = nums[i];
				index = i;
			} else if (nums[i] > secmax) {
				secmax = nums[i];
			}
		}

		if (secmax * 2 <= max) {
			return index;
		} else {
			return -1;
		}
	}

}
