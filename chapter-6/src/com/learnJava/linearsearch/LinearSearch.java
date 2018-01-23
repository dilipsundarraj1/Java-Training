package com.learnJava.linearsearch;

import java.util.Scanner;

/**
 * Created by z001qgd on 1/21/18.
 */
public class LinearSearch {

    public static void main(String[] args) {

        int[] ints= {3,15,2,8,7,1,14,25,38,10,-2,61,5};

        //to find 25

        int toFind=25;

        for(int i : ints){
            if(toFind == i){
                System.out.println("Found the Value :" + toFind);
            }
        }


    }
}
