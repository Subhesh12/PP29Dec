package Arrays;

public class majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int majorityElement(int[] num) {

		int val = num[0], count = 1;
		for (int i = 1; i < num.length; i++) {
			if (count == 0) {
				count++;
				val = num[i];
			} else if (val == num[i]) {
				count++;
			} else
				count--;

		}
		return val;
	}

}
