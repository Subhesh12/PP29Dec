package Arrays;

import java.util.List;
import java.util.ArrayList;

public class partition_label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> partitionLabels(String S) {
		if (S == null || S.length() == 0) {
			return null;
		}

		List<Integer> list = new ArrayList<>();
		int[] map = new int[26];

		for (int i = 0; i < S.length(); i++) {
			map[S.charAt(i) - 'a'] = i;
		}

		int lastidx = 0;
		int j = 0;
		for (int i = 0; i < S.length(); i++) {
			lastidx = Math.max(lastidx, map[S.charAt(i) - 'a']);
			if (lastidx == i) {
				list.add(i - j + 1);
				j = lastidx + 1;
			}
		}
		return list;
	}

}
