package com.learnJava.inheritance;

public class Dictionary extends Book  {

    private int definitions=52500;

    public void definitionMessage(){

        System.out.println("Number of Definitions : " + definitions);

        System.out.println("Number of Pages : " + pages);

    }

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        dictionary.definitionMessage();
    }

}
