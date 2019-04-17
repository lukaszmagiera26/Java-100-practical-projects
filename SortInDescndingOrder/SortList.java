package SortInDescndingOrder;

import java.util.*;

public class SortList {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("KYC");
		al.add("EYE");
		al.add("HELLO");
		al.add("WELCOME");
		al.add("CUP");
		al.add("AT");
		al.add("JAVA");
		al.add("PYTHON");

		System.out.println("Array before sorting: ");
		for (String Str1 : al) {
			System.out.println(Str1);
		}

		System.out.println("\n");

		Collections.sort(al, Collections.reverseOrder());

		System.out.println("Result of ArrayList in Descending order is: ");
		for (String Str1 : al) {
			System.out.println(Str1);
		}
	}

}
