package MinMax;

import java.util.*;

public class Array {
	public static void main(String args[]) {
		Integer[] num1 = { 7, 3, 5, 2, 8 };

		int min = (int) Collections.min(Arrays.asList(num1));
		int max = (int) Collections.max(Arrays.asList(num1));
		System.out.println("Result of Minimum element is: " + min);
		System.out.println("Result of Maximum element is: " + max);
	}
}
