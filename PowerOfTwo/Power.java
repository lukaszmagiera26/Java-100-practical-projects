package PowerOfTwo;

import java.util.*;

public class Power {

	public static void main(String args[]) {
		System.out.println("Please, insert a number: ");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		System.out.println("1" + num1);
		System.out.println("2" + (num1 -1));
		System.out.println("3" + (8 & 7));
		if ((num1 & num1 - 1) == 0) {
			System.out.println("The number " + num1 + " is a power of 2");
		} else {
			System.out.println("The number " + num1 + " is not a power of 2");
		}
	}

}
