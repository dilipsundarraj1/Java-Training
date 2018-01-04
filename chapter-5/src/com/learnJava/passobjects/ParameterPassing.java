package com.learnJava.passobjects;

/**
 * Created by z001qgd on 1/4/18.
 */
public class ParameterPassing {

    public static void main(String[] args) {
        int a1 =1;
        Num a2 = new Num(2);
        Num a3 = new Num(3);

        ParameterChanger parameterTester = new ParameterChanger();

        parameterTester.changeValues(1, a2, a3);

        System.out.println( "a1 : " + a1);
        System.out.println( "a2 : " + a2.getValue());
        System.out.println( "a3 : " + a3.getValue());
    }
}
