package Arrays;

public class number_of_subarrays_with_bounded_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public int numSubarrayBoundedMax(int[] A, int L, int R) {
		int j = 0, lastvalidcount = 0, res = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] >= L && A[i] <= R) {
				res += i - j + 1;
				lastvalidcount = i - j + 1;
			} else if (A[i] < L) {
				res += lastvalidcount;
			} else {
				j = i + 1;
				lastvalidcount = 0;
			}
		}
		return res;
	}

}
