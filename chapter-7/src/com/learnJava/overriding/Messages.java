package com.learnJava.overriding;

public class Messages {


    public static void main(String[] args) {

        Thought thought = new Thought();

        Advice advice = new Advice();

        thought.message();
        advice.message();
    }
}
