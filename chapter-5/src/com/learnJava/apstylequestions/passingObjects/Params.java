package com.learnJava.apstylequestions.passingObjects;

/**
 * Created by z001qgd on 1/5/18.
 */
public class Params {
    public void modParams(int x , String s1, String s2){

        x++;
        s1 = s1+"BB";
        s2 = new String("memory");

    }

    public static void main(String[] args) {
        Params params = new Params();
        int k=1;
        String s1 = "AA";
        String s2 = "space";
        params.modParams(k,s1,s2);

        System.out.println(k + " " + s1 + " " + s2 );
    }
}
