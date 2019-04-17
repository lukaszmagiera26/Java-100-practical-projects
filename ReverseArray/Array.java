package ReverseArray;

import java.util.*;

public class Array {

	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add("U");
		al.add("K");
		al.add("I");
		al.add("2");
		al.add("6");

		System.out.println("Before reversal: " + al);

		Collections.reverse(al);
		System.out.println("After reversal: " + al);
	}

}
