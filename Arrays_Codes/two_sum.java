package Arrays;

import java.util.Arrays;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean hasArrayTwoCandidates(int arr[], int n, int x) {
		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == x) {
				return true;
			} else if (arr[i] + arr[j] < x) {
				i++;
			} else {
				j--;
			}
		}
		return false;
	}
}
