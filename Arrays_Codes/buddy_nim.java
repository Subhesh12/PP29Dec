package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class buddy_nim {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			String[] st = br.readLine().split(" ");
			int n = Integer.parseInt(st[0]);
			int m = Integer.parseInt(st[1]);

			int[] arr1 = new int[n];
			int[] arr2 = new int[m];

			st = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				arr1[i] = Integer.parseInt(st[i]);
			}
			st = br.readLine().split(" ");
			for (int i = 0; i < m; i++) {
				arr2[i] = Integer.parseInt(st[i]);
			}

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int i = 0;
			while (arr1[i] == 0) {
				i++;
			}
			int j = 0;
			while (arr2[j] == 0) {
				j++;
			}

			boolean flag = false;
			while (i < arr1.length && j < arr2.length) {
				if (arr1[i] != arr2[j]) {
					sb.append("Alice\n");
					flag = true;
					break;
				}
				i++;
				j++;
			}

			if (flag == false && i == n && j == m) {
				sb.append("Bob\n");
			} else if (flag == false) {
				sb.append("Alice\n");
			}

		}

		System.out.println(sb);
	}

}
