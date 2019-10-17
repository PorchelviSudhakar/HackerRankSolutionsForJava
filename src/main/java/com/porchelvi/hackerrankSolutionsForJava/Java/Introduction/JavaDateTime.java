package com.porchelvi.hackerrankSolutionsForJava.Java.Introduction;

import java.text.SimpleDateFormat;
import java.util.Date;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
         String date = String.valueOf(month+"/"+day+"/"+year);
        SimpleDateFormat format = new SimpleDateFormat("EEEE");
       
        System.out.println(date);
        Date d = new Date(date);
        System.out.println(d);
        System.out.println(format.format(d));
        return format.format(d).toUpperCase();
    }

}


