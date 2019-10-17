package com.porchelvi.hackerrankSolutionsForJava.Java.Introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	
	static Scanner in = new Scanner(System.in);
	static int B = in.nextInt();
	static int H = in.nextInt();
	static boolean flag = B>0 && H>0;

	public static String myVar = initializeClassVariable();
	        
	    private static String initializeClassVariable() {
	        if(!flag){
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	        }
	        return "";
	        // initialization code goes here
	    }

}
