package com.porchelvi.hackerrankSolutionsForJava.Java.Introduction;

import java.util.Scanner;

public class JavaEndOfFile {

    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 1;
                 System.out.println(i +" "+ input);
        while(scanner.hasNext()){
            i++;
            // System.out.println(input);
            if(scanner.hasNextLine()){
             System.out.println(i + " "+ scanner.nextLine());
            }

        }
       
    }
}


