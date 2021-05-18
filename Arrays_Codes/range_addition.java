package Arrays;

public class range_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] Range(int length, int[][] updates) {
		int[] ans = new int[length];

		for (int i = 0; i < updates.length; i++) {
			int si = updates[i][0];
			int ei = updates[i][1];
			int val = updates[i][2];

			ans[si] += val;

			if (ei + 1 < ans.length)
				ans[ei + 1] -= val;
		}

		for (int i = 1; i < ans.length; i++) {
			ans[i] = ans[i] + ans[i - 1];
		}
		return ans;

	}

}
