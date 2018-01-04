package com.learnJava.nulll;

/**
 * Created by z001qgd on 1/2/18.
 */
public class NameIsNull {

    public static void main(String[] args) {

        String name=null;//not initialized ,therefore null

        if(name ==null)
            System.out.println("Invalid Name");
        else
            System.out.println("Valid Name and the length is : " + name.length());

    }

}
