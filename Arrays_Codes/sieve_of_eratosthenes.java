package Arrays;

import java.util.ArrayList;

public class sieve_of_eratosthenes {
	public static ArrayList<Integer> sieveOfEratosthenes(int N) {
		boolean[] arr = new boolean[N + 1]; // false - prime || true - non prime

		for (int i = 2; i * i <= N; i++) {

			if (arr[i] == false) {
				for (int j = i * 2; j <= N; j += i) {
					arr[j] = true;
				}
			}

		}

		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 2; i <= N; i++) {
			if (arr[i] == false) {
				ans.add(i);
			}
		}

		return ans;

	}
}
