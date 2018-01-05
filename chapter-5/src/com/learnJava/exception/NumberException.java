package com.learnJava.exception;

/**
 * Created by z001qgd on 1/5/18.
 */
public class NumberException {

    public static void main(String[] args) {

        divide(10,0);
    }

    public static  void divide(int a, int b){

        System.out.println(a/b); //ArithmeticException

    }
}
