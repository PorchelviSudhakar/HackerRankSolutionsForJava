package com.porchelvi.hackerrankSolutionsForJava;

import java.util.Scanner;

public class JavaStdinandStdoutI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a);
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				System.out.println(scan.nextInt());
			}
		}
	}

}
