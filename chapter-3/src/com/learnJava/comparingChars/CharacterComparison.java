package com.learnJava.comparingChars;

/**
 * Created by z001qgd on 12/27/17.
 */
public class CharacterComparison {

    public static void main(String[] args) {

        char c ='c';
        char d ='d';
        char c1='c';

        System.out.println(c==d);

        System.out.println(c==c1);


        if(c>d){
            System.out.println("c is greater than d");
        }else{
            System.out.println("c is lesser than d");
        }



    }
}
