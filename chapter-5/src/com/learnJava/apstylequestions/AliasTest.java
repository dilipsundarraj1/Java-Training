package com.learnJava.apstylequestions;

/**
 * Created by z001qgd on 1/5/18.
 */
public class AliasTest {

    private int number;

    public AliasTest(int number) {
        this.number = number;
    }

    public static void main(String[] args) {

        AliasTest aliasTest1 = new AliasTest(1);
        AliasTest aliasTest2 = new AliasTest(1);

        System.out.println(aliasTest1 == aliasTest2);
        Integer integer1  = new Integer(3);
        Integer integer2  = new Integer(3);

        System.out.println(integer1==integer2);
        System.out.println(integer1.equals(integer2));


        String word1 ="blue";
        String word2 ="red";
        String word3 ="green";

        word2=word3;
        word1=word3;
        word3=word1;

        System.out.println(word1 + " " + word2 + " " + word3);

    }

}
