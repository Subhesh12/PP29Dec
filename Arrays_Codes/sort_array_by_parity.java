package Arrays;

public class sort_array_by_parity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] sortArrayByParity(int[] A) {
		for (int i = 0, j = 0; j < A.length; j++) {
			if (A[j] % 2 == 0) {
				int temp = A[i];
				A[i++] = A[j];
				A[j] = temp;
			}
		}
		return A;
	}

}
