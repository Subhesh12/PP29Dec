package Arrays;

public class squares_of_a_sorted_array {
	public int[] sortedSquares(int[] A) {
		int[] result = new int[A.length];
		int i = 0, j = A.length - 1;
		for (int k = A.length - 1; k >= 0; k--) {
			if (Math.abs(A[i]) > Math.abs(A[j])) {
				result[k] = A[i] * A[i];
				i++;
			} else {
				result[k] = A[j] * A[j];
				j--;
			}
		}
		return result;
	}
}
