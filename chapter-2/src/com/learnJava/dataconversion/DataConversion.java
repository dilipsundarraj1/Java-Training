package com.learnJava.dataconversion;

/**
 * Created by z001qgd on 1/1/18.
 */
public class DataConversion {

    public static void main(String[] args) {

        int total = 1 ;

        double total2;

        total2= total;



        int total3 ;
        double total4=9.0;
       // total3 = total4;

        //assignment conversion

        int dollars = 12;
        double money = dollars;

        float sum = 4.0f;
        int count=2;

        float result = sum/count;

        System.out.println(result);
        float  f1=2.5f;
        int result1 = (int) f1;

        System.out.println(result1);


    }
}
