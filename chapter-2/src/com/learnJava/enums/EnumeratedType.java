package com.learnJava.enums;

/**
 * Created by z001qgd on 1/16/18.
 */
public class EnumeratedType {



    enum Flavor {vanilla, choclate, strawberry};

    public static void main(String[] args) {
        int i =0;
        System.out.println(i);
        Flavor cone1,cone2,cone3;

        cone1= Flavor.choclate;
        cone2= Flavor.vanilla;
        cone3= Flavor.strawberry;

        System.out.println(cone1);
        System.out.println(cone2);
        System.out.println(cone3);

    }
}
