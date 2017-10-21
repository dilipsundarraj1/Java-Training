package com.learnJava.callingMethods;

/**
 * Created by z001qgd on 10/20/17.
 */
public class ClassA {

   public void  methodA(){

       System.out.println("Inside Method A");
   }

    public static void main(String[] args) {

       ClassB classB = new ClassB();
       classB.methodB();

    }
}
