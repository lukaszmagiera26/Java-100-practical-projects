package RandomNumbers;

import java.util.*;

public class Numbers {

	public static void main(String args[]) {
		int rand;
		Random radnum = new Random();

		System.out.println("The result of the randoms are: ");

		for (rand = 1; rand <= 7; rand++) {
			System.out.print(radnum.nextInt(2000) + "\n");
		}
	}

}
