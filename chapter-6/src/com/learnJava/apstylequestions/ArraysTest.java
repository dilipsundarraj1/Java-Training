package com.learnJava.apstylequestions;

/**
 * Created by z001qgd on 1/13/18.
 */
public class ArraysTest {

    public static void main(String[] args) {

        int[] a = new int[10];

        int[] b;

        int[] a1 = {0,1,2,3,4};

        int[] b1 = {1,2,3,4};

        int[] c1 = new int[4];

        for(int i=0;i<4;i++)
            c1[i] = i;

        for(int i=0;i<4;i++){
            System.out.println(c1[i]);
            System.out.println(b1[i]);
            System.out.println(a1[i]);
        }

        int[] a2 = new int[5];

        for(int i=0;i<a2.length;i++)
            System.out.println(a2[i]);






    }
}
