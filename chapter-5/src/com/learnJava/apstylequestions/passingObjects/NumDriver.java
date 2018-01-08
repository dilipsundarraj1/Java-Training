package com.learnJava.apstylequestions.passingObjects;

/**
 * Created by z001qgd on 1/7/18.
 */
public class NumDriver {

    public static void main(String[] args) {

        Num num1 = new Num(1);
        Num num2 = new Num(2);
        int s1 =10;

        NumChanger numChanger = new NumChanger();

        numChanger.changeValue(num1,num2);

        System.out.println(s1 + " " + num1.getValue() + " "+ num2.getValue());

    }
}
