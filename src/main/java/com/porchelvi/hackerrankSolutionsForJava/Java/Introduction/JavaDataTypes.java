package com.porchelvi.hackerrankSolutionsForJava.Java.Introduction;

import java.util.Scanner;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long l1=32768L;
        long l2=32767L;
        long l3=2147483648L;
        long l4=2147483647L;
        long l5= -9223372036854775808l;
        long l6= 9223372036854775807l;
        
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
               System.out.println("* byte");
                }
                //  −32768 to 32767
                if(x>= -l1 && x<= l2){
                System.out.println("* short");
                }
                // −2147483648 to 2147483647
                if(x>= -l3 && x<= l4){
                System.out.println("* int");
                }
                // −9223372036854775808 to 9223372036854775807
                if(x>= l5 && x<= l6){
                System.out.println("* long");
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




