package com.learnJava.wrapper;

import java.util.Scanner;

/**
 * Created by z001qgd on 11/29/17.
 */
public class WrapperExample {

    public static void main(String[] args) {

            int val =0;
            System.out.println(val);

            Integer val1 = new Integer(0);

            System.out.println("O = 0 : " +val1.compareTo(0));
            System.out.println("O > 1 : " +val1.compareTo(-1));
            System.out.println("O < 1 : " +val1.compareTo(1));
            System.out.println(val1.floatValue());


            Float flt =  new Float(1.0);
            System.out.println(flt.compareTo(2.0f));
            System.out.println(flt);
            System.out.println(flt.intValue());
            System.out.println(flt.doubleValue());
                Long lon =  new Long(1l);


    }
}
