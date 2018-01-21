package com.learnJava.random;

import java.util.Random;



/**
 * Created by z001qgd on 1/16/18.
 */
public class RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(random.nextInt(100));;

        System.out.println(random.nextInt(100)+1);;

        System.out.println(random.nextDouble());
    }
}
