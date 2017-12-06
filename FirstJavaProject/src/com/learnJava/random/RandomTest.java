package com.learnJava.random;

import java.util.Random;

/**
 * Created by z001qgd on 12/2/17.
 */
public class RandomTest {

    public static void main(String[] args) {



        Random random = new Random();

      //  System.out.println(random.nextInt(6));
        for (int i=0;i<=5; i++){
            //System.out.println(i);
            System.out.println("Randon NUmber is " +  random.nextInt(6));

        }

        System.out.println("Randon Double is " +  random.nextDouble());
        System.out.println("Randon Boolean is " +  random.nextBoolean());

        System.out.println("Square root : " +  Math.sqrt(25));
        System.out.println("Square root : " +  Math.sqrt(25));
        System.out.println("Sum  : " +  Math.addExact(1,2));
        System.out.println("Multiply :" +  Math.multiplyExact(2,3));

        /*System.out.println(random.nextDouble());

        System.out.println(Math.random());;

        System.out.println(Math.addExact(1,1));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.ceil(2.49));
        System.out.println(Math.floor(2.49));
        System.out.println(Math.cos(30));*/

    }
}
