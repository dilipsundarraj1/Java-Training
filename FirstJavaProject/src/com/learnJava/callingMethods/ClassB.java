package com.learnJava.callingMethods;

/**
 * Created by z001qgd on 10/20/17.
 */
public class ClassB {

    public void  methodB(){

        System.out.println("Inside Method B");
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.methodA();
    }
}
