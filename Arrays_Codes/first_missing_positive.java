package Arrays;

public class first_missing_positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstMissingPositive(int[] nums) {

		int n = nums.length;

		for (int i = 0; i < nums.length; i++) {
			if (i + 1 == nums[i]) {
				continue;
			}

			if (nums[i] < 1 || nums[i] > n) {
				continue;
			}

			int idx1 = i;
			int idx2 = nums[i] - 1;

			if (nums[idx2] == nums[idx1]) {
				continue;
			}

			int temp = nums[idx1];
			nums[idx1] = nums[idx2];
			nums[idx2] = temp;
			i--;

		}

		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}

}
