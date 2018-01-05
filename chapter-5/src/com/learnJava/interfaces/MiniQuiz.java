package com.learnJava.interfaces;

import java.util.Scanner;

/**
 * Created by z001qgd on 1/5/18.
 */
public class MiniQuiz  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String possbile;
        Question q1 = new Question("What is the capital of Minnesota ? ","Saint Paul");
        q1.setComplexity(1);


        Question q2 = new Question("What is the capital of India ? ","New  Delhi");
        q1.setComplexity(10);

        System.out.println(q1.getQuestion());
        System.out.println("Complexity Level : " + q1.getComplexity());
        possbile = scanner.nextLine();

        if(q1.getAnswer().equals(possbile))
            System.out.println("correct");
        else
            System.out.println("No, The answer is "+ q1.getAnswer());


        System.out.println(q2.getQuestion());
        System.out.println("Complexity Level : " + q2.getComplexity());
        possbile = scanner.nextLine();

        if(q1.getAnswer().equals(possbile))
            System.out.println("correct");
        else
            System.out.println("No, The answer is "+ q2.getAnswer());


    }
}
