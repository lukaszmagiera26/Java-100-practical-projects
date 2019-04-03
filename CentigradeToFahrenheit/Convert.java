package CentigradeToFahrenheit;

import java.util.*;

public class Convert {

	public static void main(String args[]) {
		float degreeF;
		double degreeC;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please insert values in Celcuis");
		degreeF = sc.nextFloat();

		degreeC = (1.8 * degreeF) + 32;

		System.out.println("Celcuis equilvalent of " + degreeF + " is: " + degreeC + ".");
	}

}