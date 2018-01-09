package com.learnJava.arrayobjects;

/**
 * Created by z001qgd on 1/9/18.
 */
public class StringArray {
    public static void main(String[] args) {

        String[] strings = new String[5];

        String[] grades = {"A","A-","B+","B-","C+","C-"}; // intialized array holds the grades

        int[] cutoff = {95,90,87,83,80, 77};// intialized array holds the grade marks

        for (int level=0; level < cutoff.length;level++){
            System.out.println(grades[level] + "\t" + cutoff[level]);
        }
    }
}
