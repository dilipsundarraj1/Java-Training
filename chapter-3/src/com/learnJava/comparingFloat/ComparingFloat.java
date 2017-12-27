package com.learnJava.comparingFloat;

/**
 * Created by z001qgd on 12/27/17.
 */
public class ComparingFloat {

    public static void main(String[] args) {

        float f1=2.4533f;
        float f2=2.4534f;

        System.out.println(f1==f2);

        System.out.println(f2-f1);
        System.out.println(Math.abs(f2-f1));

        System.out.println((Math.abs(f2-f1)< 0.1));
    }
}
