package Arrays;

import java.util.List;
import java.util.ArrayList;

public class majority_element_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 1, 3, 4, 1, 5, 6, 1 };
		System.out.println(majorityElement(nums));
	}

	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> res = new ArrayList<>();
		if (nums.length == 0)
			return res;

		int val1 = nums[0];
		int val2 = nums[0];
		int count1 = 1;
		int count2 = 0;

		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			if (num == val1)
				count1++;
			else if (num == val2)
				count2++;
			else if (count1 == 0) {
				val1 = num;
				count1++;
			} else if (count2 == 0) {
				val2 = num;
				count2++;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int val : nums) {
			if (val == val1) {
				count1++;
			} else if (val == val2) {
				count2++;
			}
		}
		if (count1 > (nums.length / 3)) {
			res.add(val1);
		}
		if (count2 > (nums.length / 3)) {
			res.add(val2);
		}
		return res;
	}

}
