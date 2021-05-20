package Arrays2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class merge_intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] merge(int[][] intervals) {
		int[] start = new int[intervals.length];
		int[] end = new int[intervals.length];

		for (int i = 0; i < intervals.length; i++) {
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
		}

		Arrays.sort(start);
		Arrays.sort(end);

		ArrayList<int[]> ans = new ArrayList<>();

		int j = 0;
		int i = 0;

		while (i < start.length - 1) {
			if (end[i] >= start[i + 1]) {
				i++;
			} else {
				int[] arr = new int[2];
				arr[0] = start[j];
				arr[1] = end[i];

				ans.add(arr);
				j = i + 1;
				i++;
			}
		}

		int[] arr = new int[2];
		arr[0] = start[j];
		arr[1] = end[i];
		ans.add(arr);

		return ans.toArray(new int[ans.size()][2]);
	}

}
