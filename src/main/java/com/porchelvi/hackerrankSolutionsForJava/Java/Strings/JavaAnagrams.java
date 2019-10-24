package com.porchelvi.hackerrankSolutionsForJava.Java.Strings;

import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		// Complete the function

		// Complete the function
		a = a.toLowerCase();
		b = b.toLowerCase();

		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();

		boolean status = false;
		if (a1.length != b1.length) {
			return false;
		}
		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (Character.compare(a1[i], a1[j]) > 0) {
					char temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}

		for (int k = 0; k < b1.length; k++) {
			for (int l = k + 1; l < b1.length; l++) {
				if (Character.compare(b1[k], b1[l]) > 0) {
					char temp = b1[k];
					b1[k] = b1[l];
					b1[l] = temp;
				}
			}
		}

		for (int z = 0; z < a1.length; z++) {
			char c = a1[z];
			if (a1[z] != b1[z]) {
				return false;

			} else {
				status = true;
			}

		}
		return status;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
