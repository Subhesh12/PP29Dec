package Arrays;

public class partition_array_to_disjoint_intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int partitionDisjoint(int[] a) {
		int cmax = a[0], partitionIdx = 0, nextmax = cmax;
		for (int i = 1; i < a.length; i++) {
			if (cmax > a[i]) {
				cmax = nextmax;
				partitionIdx = i;
			} else {
				nextmax = Math.max(nextmax, a[i]);
			}
		}
		
		return partitionIdx + 1;
		
	}
}
