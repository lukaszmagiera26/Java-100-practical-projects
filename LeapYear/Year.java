package LeapYear;

import java.util.*;

public class Year {

	public static void main(String args[]) {
		System.out.println("Please insert a prefered year: ");
		Scanner sc = new Scanner(System.in);

		int yr = sc.nextInt();

		if ((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0))) {
			System.out.println("This year : " + yr + " is a leap year");
		} else {
			System.out.println("This year " + yr + " is not a leap year");
		}
	}

}
