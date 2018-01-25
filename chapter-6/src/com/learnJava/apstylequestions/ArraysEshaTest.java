package com.learnJava.apstylequestions;

/**
 * Created by z001qgd on 1/23/18.
 */
public class ArraysEshaTest {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        //Staring index = 0
        //Ending Index =4
        System.out.println(intArray.length);

        for(int i=0;i< intArray.length;i++)
            System.out.println(intArray[i]);

        for(int i=intArray.length-1;i>=0;i--)
            System.out.println(intArray[i]);
    }
}
