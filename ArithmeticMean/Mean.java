package ArithmeticMean;

import java.util.*;

public class Mean {

	public static void main(String args[]) {
		int x, y, add = 0, meanum;
		int num1[] = new int[50];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please choose number: ");
		x = sc.nextInt();

		System.out.println("Please enter only " + x + " numbers");
		for (y = 0; y < x; y++) {
			num1[y] = sc.nextInt();
			add = add + num1[y];
		}
		meanum = add / x;

		System.out.println("Result of Arithmetic Mean is: " + meanum);
	}

}
