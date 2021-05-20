import java.lang.*;
import java.util.Scanner;
import java.io.*;

class digit_multiplier {

	static String getSmallest(Long n) {
		StringBuilder sb = new StringBuilder();
		if (n < 10)
			return n + "";
		else {
			for (int i = 9; i > 1; i--) {
				while (n % i == 0) {
					sb.append(i);
					n /= i;
				}
			}
			if (n > 10)
				return "-1";
			else {
				sb.reverse();
				return sb.toString();
			}
		}
	}
}