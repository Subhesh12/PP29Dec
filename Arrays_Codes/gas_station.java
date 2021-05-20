package Arrays2;

public class gas_station {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;
		int total = 0, subsum = Integer.MAX_VALUE, start = 0;
		for (int i = 0; i < n; ++i) {
			total += gas[i] - cost[i];
			if (total < subsum) {
				subsum = total;
				start = i + 1;
			}
		}
		return (total < 0) ? -1 : (start % n);
	}
}
