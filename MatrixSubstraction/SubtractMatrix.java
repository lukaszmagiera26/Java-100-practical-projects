package MatrixSubstraction;

import java.io.*;

public class SubtractMatrix {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1[][] = new int[3][3];
		int num2[][] = new int[3][3];
		int num3[][] = new int[3][3];

		int x, y;

//Program for Matrix 1

		System.out.println("Please insert First Matrix");
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
				num1[x][y] = Integer.parseInt(br.readLine());
			}
		}
		for (x = 0; x < num1.length; x++) {
			for (y = 0; y < 3; y++) {
				System.out.print(" " + num1[x][y]);
			}
			System.out.println();
		}

		// Program for Matrix 2

		System.out.println("Please insert Second Matrix");
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
				num2[x][y] = Integer.parseInt(br.readLine());
			}
		}
		for (x = 0; x < num2.length; x++) {
			for (y = 0; y < 3; y++) {
				System.out.print(" " + num2[x][y]);
			}
			System.out.println();
		}

//Program for Subtraction of Matrix 1 and 2

		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
				num3[x][y] = num1[x][y] * num2[x][y];
			}
		}

		System.out.println("Result of Subtraction is: ");
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
				System.out.print(" " + num3[x][y]);
			}
			System.out.println();
		}
	}

}
