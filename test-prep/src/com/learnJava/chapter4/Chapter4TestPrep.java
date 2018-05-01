package com.learnJava.chapter4;

import java.util.stream.IntStream;

public class Chapter4TestPrep {

    public static void main(String[] args) {

        float x = (int) Math.random();

        System.out.println(x);

        float y = (float) Math.random();

        System.out.println(y);

        Integer intOb = new Integer(3);
        int i =0;

        Object ob = new Integer(4);
        Double doubOb = new Double(3.0);
        System.out.println(intOb.compareTo((Integer) ob ));

        Integer k = new Integer(4);
        Integer m = new Integer(3);
        System.out.println(k.toString());
        System.out.println(m.toString());

        String name = "Esha Sekar";

        System.out.println(name.substring(0,0));

        System.out.println(name.substring(1,3));
        int k1=name.indexOf(" ");
        System.out.println(k1);

      System.out.println(name.substring(k1+1,10));





    }
}
