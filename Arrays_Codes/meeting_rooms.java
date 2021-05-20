package Arrays2;

import java.util.Arrays;

public class meeting_rooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean canAttendMeetings(int[][] intervals) {
		int len = intervals.length;
		if (len == 0) {
			return true;
		}
		int[] begin = new int[len];
		int[] stop = new int[len];
		for (int i = 0; i < len; i++) {
			begin[i] = intervals[i][0];
			stop[i] = intervals[i][1];
		}
		Arrays.sort(begin);
		Arrays.sort(stop);
		int endT = 0;
		for (int i = 1; i < len; i++) {
			if (begin[i] < stop[i - 1]) {
				return false;
			}
		}
		return true;
	}

}
