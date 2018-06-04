package com.learnJava;

public class Derived extends Base {

    public void methodOne() {
        super.methodOne();
        {
            System.out.print("D");
        }
    }

    public static void main(String[] args) {

        Base b = new Derived();
        b.methodOne();
    }
}
