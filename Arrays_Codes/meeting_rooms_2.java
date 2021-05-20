package Arrays2;

import java.util.Arrays;

public class meeting_rooms_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minMeetingRooms(int[][] intervals) {
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			starts[i] = intervals[i][0];
			ends[i] = intervals[i][1];
		}
		Arrays.sort(starts);
		Arrays.sort(ends);

		int cmax = 0;
		int omax = Integer.MIN_VALUE;
		int i = 0;
		int j = 0;
		while (i < starts.length) {
			if (starts[i] < ends[j]) {
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
