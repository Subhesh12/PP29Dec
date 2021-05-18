package Arrays;

import java.util.Arrays;

public class min_no_of_platform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int findPlatform(int arr[], int dep[], int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int cmax = 0;
		int omax = Integer.MIN_VALUE;
		int i = 0;
		int j = 0;
		while (i < arr.length) {
			if (arr[i] <= dep[j]) {
				cmax++;
				i++;
				omax = Math.max(omax, cmax);
			} else {
				cmax--;
				j++;
			}
		}
		return omax;
	}
}
