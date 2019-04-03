package ArrayList;

import java.util.*;

public class Array {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("USA");
		list.add("Canada");
		list.add("Nigeria");
		list.add("China");

		System.out.println("These are the elements of array list: " + list);

		// How to add elements into the array using index
		list.add(0, "Mexico");
		list.add(3, "Ghana");
		System.out.println("These are the current elements: " + list);

		// How to remove elements from array
		list.remove(1);
		list.remove(4);
		System.out.println("This is the remaing elements after removal: " + list);
	}

}