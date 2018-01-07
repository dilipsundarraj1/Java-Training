package com.learnJava.comparable;

/**
 * Created by z001qgd on 1/5/18.
 */
public class NumDriver {

    public static void main(String[] args) {

        int i1 = 1;
        int i2 =2;

        if(i1 < i2)
            System.out.println(-1);
        else if(i1 >i2)
            System.out.println(1);
        else
            System.out.println(0);

        Num num1 = new Num(1);
        Num num2 = new Num(2);

        System.out.println(num1.compareTo(num2));


        System.out.println(num1);
    }
}
