package Arrays;

public class wiggle_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void wiggleSort(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (i % 2 == 0) {
				if (nums[i] > nums[i + 1]) {
					swap(nums, i, i + 1);
				}
			} else {
				if (nums[i] < nums[i + 1]) {
					swap(nums, i, i + 1);
				}
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[i + 1];
		nums[i + 1] = temp;
	}

}
