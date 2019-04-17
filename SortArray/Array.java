package SortArray;

import java.util.Arrays;

public class Array {

	public static void main(String args[]) {
		int x[] = { 3, 4, 8, 9, -4, 0, 5, 7, -9 };
		Arrays.sort(x);
		printArray("This is sorted Array. ", x);
	}

	private static void printArray(String string, int[] x) {
		for (int y = 0; y < x.length; y++) {
			if (y != 0) {
				System.out.print(",");
			}
			System.out.print(x[y]);
		}

		System.out.println();
		System.out.println(string);
		

		
	}

}
