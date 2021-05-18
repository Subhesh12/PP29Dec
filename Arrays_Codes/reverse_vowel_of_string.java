package Arrays;

public class reverse_vowel_of_string {

	public static void main(String[] args) {

	}

	public String reverseVowels(String s) {
		if (s.length() == 0)
			return s;
		char[] arr = s.toCharArray();
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			if (!isVowel(arr[low]) && !isVowel(arr[high])) {
				low++;
				high--;
			} else if (!isVowel(arr[low])) {
				low++;
			} else if (!isVowel(arr[high])) {
				high--;
			} else {
				char temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return new String(arr);
	}

	private boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
