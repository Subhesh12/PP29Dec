package Arrays;

public class max_chunks_to_make_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxChunksToSorted(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int count = 0, max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			if (max == i) {
				count++;
			}
		}

		return count;
	}

}
