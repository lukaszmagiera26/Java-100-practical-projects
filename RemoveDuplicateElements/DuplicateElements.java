package RemoveDuplicateElements;

import java.util.*;

public class DuplicateElements {

	public static void main(String args[]) {
		List<String> al = new ArrayList<String>();
	
		al.add("TTT");
		al.add("SSS");
		al.add("TTT");
		al.add("DDD");
		al.add("AAA");
		al.add("SSS");
		al.add("TTT");

		System.out.println("List before removing duplicate elemnts: ");
		System.out.println(al);

		LinkedHashSet<String> hset = new LinkedHashSet<String>();

		hset.addAll(al);

		al.clear();

		al.addAll(hset);

		System.out.println("\n");

		System.out.print("List after rmoving dupliacte elements: " + al);
	}

}
