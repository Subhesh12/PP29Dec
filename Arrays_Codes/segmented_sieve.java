package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class segmented_sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = scn.nextInt();
		while (t-- > 0) {
			int a = scn.nextInt();
			int b = scn.nextInt();

			int rootb = (int) Math.sqrt(b);
			ArrayList<Integer> primes = sieveOfEratosthenes(rootb);

			boolean[] arr = new boolean[b - a + 1];

			for (int i : primes) {
				int multiple = (int) Math.ceil(a * 1.0 / i);
				if (multiple == 1) {
					multiple++;
				}

				int firstidx = (multiple * i) - a;

				while (firstidx < arr.length) {
					arr[firstidx] = true;
					firstidx += i;
				}
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == false && (a + i) != 1) {
					sb.append(a + i + "\n");
				}
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}

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
