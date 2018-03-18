package com.learnJava.test;

public class B extends A {

    void foo(){
        System.out.println("B's foo");
    }

    static void doSomething(Object param){

    }

    public static void main(String[] args) {
        A aref = new B();
        aref.foo();

        Object obj = new String("hello");
/*

        obj.upperCase();
        obj.subString(0,5);
        obj.equals("hi");
        obj.compareTo("hi");
*/

       doSomething("Java");
       doSomething(new String("java"));
       doSomething(14);
       doSomething(new Integer(13));




    }
}
