package Arrays;

public class consecutive_number_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int consecutiveNumbersSum(int N) {
		int count = 0;
		for (int k = 1; k < Math.sqrt(2 * N); k++) {
			if ((N - (k * (k - 1) / 2)) % k == 0) {
				count++;
			}
		}
		return count;
	}

}
