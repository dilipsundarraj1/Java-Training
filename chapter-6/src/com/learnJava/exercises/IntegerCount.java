package com.learnJava.exercises;

import java.util.Scanner;

/**
 * Created by z001qgd on 1/29/18.
 */
public class IntegerCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
    }
}
