package Arrays;

import java.util.Arrays;

public class minimum_moves_to_equal_array_elements_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int count = 0;

		int i = 0;
		int median = nums[nums.length / 2];
		while (i < nums.length) {
			count += Math.abs(nums[i] - median);
			i++;
		}
		return count;
	}

}
