package com.learnJava.final1;

/**
 * Created by z001qgd on 12/31/17.
 */
public class Program1 {

    static double calc(double a, double b){

        double num = a *b;
        b=a;
        //num = a+b;

        return  num;
    }

    int doIt(int x){

     return   x*x;
    }
    public static void main(String[] args) {
        double x=5.1,y =6.2;

        System.out.println(calc(x,y));
    }
}
