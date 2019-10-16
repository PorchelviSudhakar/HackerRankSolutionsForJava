package com.porchelvi.hackerrankSolutionsForJava.Java;

import java.util.Scanner;

public class JavaStdinandStdoutI {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a);
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				System.out.println(scan.nextInt());
			}
		}
	}

}
