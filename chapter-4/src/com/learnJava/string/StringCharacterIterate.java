package com.learnJava.string;

/**
 * Created by z001qgd on 12/31/17.
 */
public class StringCharacterIterate {

    void iterateEachCharacter(){

        String name = "Dilip";

        for(int i=0;i<name.length();i++) {

            char c = name.charAt(i);

            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        String name = "Dilip";

        StringCharacterIterate iterateEachCharacter = new StringCharacterIterate();
        iterateEachCharacter.iterateEachCharacter();

        int count = 0;
        System.out.println("Length of the String : "  + name.length());

        for(int i=0;i<name.length();i++){

            char c = name.charAt(i);

            if(c == 'i'){
                count = count +1 ;
            }
        }

        System.out.println("The total number of i's are : " + count);
    }
}
