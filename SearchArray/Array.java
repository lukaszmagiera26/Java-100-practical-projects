package SearchArray;

import java.util.Arrays;

public class Array {

	public static void main(String args[]) {
		int x[] = { 2, 6, 13, 21, 36, 47, 63, 81, 97 };
		int index = Arrays.binarySearch(x, 81);
		System.out.println("This element is found at index: " + index);
	}
}
