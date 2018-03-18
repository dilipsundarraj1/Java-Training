package com.learnJava.test;

import java.util.ArrayList;

public class Xyz extends Abc {

    public void c(){
        super.c();
        System.out.println("XYZ");
    }

    public void z(){
        c();
    }

    public static void main(String[] args) {

        ArrayList<Abc> items = new ArrayList<Abc>();
        items.add(new Abc());
        items.add(new Xyz());
      // items.add(new Object());

        Abc p = new Xyz();
        System.out.println(p.toString());
    }
}
