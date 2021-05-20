package Arrays2;

import java.util.PriorityQueue;

public class trapping_rain_water_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class Pair implements Comparable<Pair> {
		int row;
		int col;
		int height;

		public Pair(int row, int col, int height) {
			this.row = row;
			this.col = col;
			this.height = height;
		}

		@Override
		public int compareTo(Pair o) {
			return this.height - o.height;
		}
	}

	public int trapRainWater(int[][] heights) {
		if (heights == null || heights.length == 0 || heights[0].length == 0)
			return 0;

		PriorityQueue<Pair> queue = new PriorityQueue<>();
		int m = heights.length;
		int n = heights[0].length;
		boolean[][] visited = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			visited[i][0] = true;
			visited[i][n - 1] = true;
			queue.offer(new Pair(i, 0, heights[i][0]));
			queue.offer(new Pair(i, n - 1, heights[i][n - 1]));
		}

		for (int i = 0; i < n; i++) {
			visited[0][i] = true;
			visited[m - 1][i] = true;
			queue.offer(new Pair(0, i, heights[0][i]));
			queue.offer(new Pair(m - 1, i, heights[m - 1][i]));
		}

		int[][] dirs = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		int res = 0;
		while (!queue.isEmpty()) {
			Pair cell = queue.poll();
			for (int[] dir : dirs) {
				int row = cell.row + dir[0];
				int col = cell.col + dir[1];
				if (row >= 0 && row < m && col >= 0 && col < n && !visited[row][col]) {
					visited[row][col] = true;
					res += Math.max(0, cell.height - heights[row][col]);
					queue.offer(new Pair(row, col, Math.max(heights[row][col], cell.height)));
				}
			}
		}

		return res;
	}

}
