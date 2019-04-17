
package StringToDataTypes;

import java.text.DecimalFormat;

public class ConvertString {

	public static void main(String args[]) {
// String to Boolean
		String Str1 = "False";

		boolean bol = Boolean.parseBoolean(Str1);
		System.out.println("The boolean result is: " + bol);

		// String to Integer
		String Str2 = "500";
		int num1 = 300;

		int num2 = Integer.parseInt(Str2);
		int add = num1 + num2;
		System.out.println("Integer result is: " + add);

		// String to Double
		String Str3 = "301.92";
		System.out.println("str3"+Str3);
		Double dob = 45.78;
	    DecimalFormat a1 = new DecimalFormat();
		Double dob1 = Double.parseDouble(Str3);
		System.out.println("d"+dob1);
		Double adddob = dob + dob1;
		System.out.println("Double result is: " + adddob);
	}

}