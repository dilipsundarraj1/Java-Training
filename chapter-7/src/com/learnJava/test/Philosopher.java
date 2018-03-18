package com.learnJava.test;

public class Philosopher implements Speaker,Writer {
    @Override
    public void write() {

    }

    @Override
    public void speak() {

    }

    public static void main(String[] args) {

        Speaker s = new Philosopher();
      /*  Speaker s1 = new Writer();
        Philosopher p = new Speaker();;
        Philosopher p1 = new Writer();
        Object o = new Writer();*/
    }
}
