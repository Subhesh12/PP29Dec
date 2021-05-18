package Arrays;

import java.util.Arrays;

public class boats_to_save_people {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int i = 0;
		int j = people.length - 1;
		int count = 0;
		while (i <= j) {
			if (people[i] + people[j] <= limit) {
				i++;
				j++;
			} else {
				j--;
			}

			count++;
		}
		return count;
	}

}
