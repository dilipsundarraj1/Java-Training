package com.learnJava.string;

/**
 * Created by z001qgd on 1/2/18.
 */
public class StingConcat {

    public static void main(String[] args) {

        String str = "hello"+"hello"+"hello";

        System.out.println(str);

        String str1= "hello".concat("hello").concat("hello");

        System.out.println(str1);
    }
}
