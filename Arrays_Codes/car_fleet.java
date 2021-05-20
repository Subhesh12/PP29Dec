package Arrays2;

import java.util.Arrays;

public class car_fleet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int carFleet(int target, int[] position, int[] speed) {
		int N = position.length, res = 0;
		double[][] cars = new double[N][2];
		for (int i = 0; i < N; ++i) {
			cars[i] = new double[] { position[i], (double) (target - position[i]) / speed[i] };
		}
		Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
		double cur = 0;
		for (int i = N - 1; i >= 0; --i) {
			if (cars[i][1] > cur) {
				cur = cars[i][1];
				res++;
			}
		}
		return res;
	}

}
