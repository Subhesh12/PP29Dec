package Arrays;

import java.util.Arrays;

public class two_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean findPair(int arr[], int size, int n) {

		Arrays.sort(arr);

		int i = 0, j = 1;

		while (i < size && j < size) {
			if (arr[j] - arr[i] == n) {
				return true;
			} else if (arr[j] - arr[i] < n) {
				j++;
			} else {
				i++;
			}
		}

		return false;
	}

}
