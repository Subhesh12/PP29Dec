package Arrays2;

import java.util.ArrayList;
import java.util.List;

public class interval_list_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
		int i = 0, j = 0;
		int m = firstList.length, n = secondList.length;
		List<int[]> resultList = new ArrayList<>();
		while (i < m && j < n) {
			int[] aVal = firstList[i], bVal = secondList[j];
			if (aVal[0] <= bVal[1] && bVal[0] <= aVal[1]) {
				resultList.add(new int[] { Math.max(aVal[0], bVal[0]), Math.min(aVal[1], bVal[1]) });
			}
			if (aVal[1] <= bVal[1]) {
				i++;
			} else {
				j++;
			}
		}

		return resultList.toArray(new int[resultList.size()][2]);
	}

}
