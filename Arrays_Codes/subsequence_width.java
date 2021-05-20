package Arrays2;

import java.util.Arrays;

public class subsequence_width {
	public int sumSubseqWidths(int[] nums) {
		
		Arrays.sort(nums);
		int n = nums.length;
		long mult = 1, res = 0, mod = (long) 1e9 + 7;
		for (int i = 0; i < n; i++) {
			res = (res + nums[i] * mult - nums[n - i - 1] * mult) % mod;

			mult = (mult * 2) % mod;
		}
		return (int) ((res + mod) % mod);
	}
}
