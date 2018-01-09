package com.learnJava.arrayindexoutofboundsexception;

/**
 * Created by z001qgd on 1/9/18.
 */
public class ArrayIndexException {

    public static void main(String[] args) {

        int[] num = {1,2,3}; // available indexes are 0 ,1,2

        System.out.println(num[3]); // index 3 is not available, this will throw the exception.
    }
}
