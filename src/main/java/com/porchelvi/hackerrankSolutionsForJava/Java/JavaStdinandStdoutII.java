package com.porchelvi.hackerrankSolutionsForJava.Java;

import java.util.Scanner;

public class JavaStdinandStdoutII {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.nextLine();
		s = scan.nextLine();

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
