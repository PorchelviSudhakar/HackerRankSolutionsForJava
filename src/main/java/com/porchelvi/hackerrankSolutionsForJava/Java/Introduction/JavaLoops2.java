package com.porchelvi.hackerrankSolutionsForJava.Java.Introduction;

import java.util.Scanner;

class JavaLoops2{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if(t>=0 && t<= 500){
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int toadd = a;
            int math = 0;
                  

           for(int j=0;j <= n-1 ;j++){
                // a=5,b=3,n=3
                math = toadd + (int) Math.pow(2,j) * b;
                toadd = math;
                System.out.print(math +" ");
                
            }
            System.out.println();
           
             
            
        }}
        in.close();
    }
}


