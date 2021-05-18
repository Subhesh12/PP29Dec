package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class best_meeting_points {

	public static void main(String[] args) {

	}

	public int minTotalDistance(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;

		List<Integer> I = new ArrayList<>();
		List<Integer> J = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					I.add(i);
				}
			}
		}

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				if (grid[i][j] == 1) {
					J.add(j);
				}
			}
		}

		int row = I.get(I.size() / 2);
		int col = J.get(J.size() / 2);

		int ans = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					ans = ans + Math.abs(i - row) + Math.abs(j - col);
				}
			}
		}

		return ans;

	}
}
