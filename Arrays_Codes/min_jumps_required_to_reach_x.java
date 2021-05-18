package Arrays;

public class min_jumps_required_to_reach_x {

	public static void main(String[] args) {

		int x = 14;

		int ans = 1;
		int cpos = 0;
		while (true) {
			cpos += ans;
			if (cpos == x) {
				System.out.println(ans);
				return;
			}

			if (cpos > x) {
				int diff = cpos - x;
				if (diff % 2 == 0) {
					System.out.println(ans);
					return;
				}
			}

			ans++;
		}
	}
}
