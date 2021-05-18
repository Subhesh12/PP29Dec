package Arrays;

public class maximum_product_subarray {

	public int maxProduct(int[] A) {
		int n = A.length, res = A[0], l = 0, r = 0;
		for (int i = 0; i < n; i++) {
			l = (l == 0 ? 1 : l) * A[i];
			r = (r == 0 ? 1 : r) * A[n - 1 - i];
			res = Math.max(res, Math.max(l, r));
		}
		return res;
	}

}
