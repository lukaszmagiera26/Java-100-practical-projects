package MultipleCatchBlocks;

import java.util.*;

public class ExceptionHandling {

	public static void main(String args[]) {
		try {

			int x[] = new int[10];
			x[5] = 4 / 8;
			System.out.println("This is an " + x[5]);
			// System.out.println(y);

		} catch (ArithmeticException e) {
			System.out.println("This is an " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This is an " + e);
		} catch (Exception e) {
			System.out.println("This is an " + e);
		}
		System.out.println("Out of try-catch block");
		
	}

}
