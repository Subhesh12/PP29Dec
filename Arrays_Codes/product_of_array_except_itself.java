package Arrays;

public class product_of_array_except_itself {
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		res[0] = nums[0];
		for (int i = 1; i < n; i++) {
			res[i] = res[i - 1] * nums[i];
		}
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			res[i] = right;
			if (i > 0) {
				res[i] *= res[i - 1];
			}
			right *= nums[i];
		}
		return res;
	}
}
