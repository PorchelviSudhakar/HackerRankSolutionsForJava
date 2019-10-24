package com.porchelvi.hackerrankSolutionsForJava.Java.Strings;

import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		// String A = "java";
		// String B = "java";
		String c = A + B;
		int s = A.compareTo(B);
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();

		System.out.println(A.length() + B.length());
		// System.out.println(s);
		if (s > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				System.out.print(Character.toUpperCase(A.charAt(0)));
			} else {
				System.out.print(a[i]);
			}
		}

		for (int j = 0; j < b.length; j++) {
			if (j == 0) {
				System.out.print(" " + Character.toUpperCase(B.charAt(0)));
			} else {
				System.out.print(b[j]);
			}
		}

		/* Enter your code here. Print output to STDOUT. */

	}
}
