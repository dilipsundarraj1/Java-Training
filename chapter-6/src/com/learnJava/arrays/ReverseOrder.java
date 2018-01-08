package com.learnJava.arrays;

import java.util.Scanner;

/**
 * Created by z001qgd on 1/8/18.
 */
public class ReverseOrder {

    public static void main(String[] args) {

        double[] numbers = new double[10]; // array of 10 elements, index of the array os 0 to 9.

        Scanner scanner = new Scanner(System.in);
        System.out.println("The size of the array : " + numbers.length);

        for(int index=0; index<numbers.length;index++){
            System.out.println( "Enter the value for " + index + " index ");
            numbers[index] = scanner.nextDouble();
        }

        for(int index= numbers.length-1; index >=0; index--){// Always use array.length-1
            System.out.println(numbers[index] + " ");
        }

    }
}
