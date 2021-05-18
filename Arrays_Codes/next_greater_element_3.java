package Arrays;

import java.util.Arrays;

public class next_greater_element_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int nextGreaterElement(int n) {
		char[] number = (n + "").toCharArray();

		int i = -1;
		for (i = number.length - 1; i > 0; i--) {
			if (number[i - 1] < number[i])
				break;
		}

		if (i == 0)
			return -1;

		int x = number[i - 1], smallest = i;
		for (int j = i + 1; j < number.length; j++)
			if (number[j] > x && number[j] <= number[smallest])
				smallest = j;

		char temp = number[i - 1];
		number[i - 1] = number[smallest];
		number[smallest] = temp;

		Arrays.sort(number, i, number.length);

		long val = Long.parseLong(new String(number));

		if (val <= Integer.MAX_VALUE) {
			return (int) val;
		} else {
			return -1;
		}
	}

}
