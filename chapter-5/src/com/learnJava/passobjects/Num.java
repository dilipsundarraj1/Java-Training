package com.learnJava.passobjects;

/**
 * Created by z001qgd on 1/4/18.
 */
public class Num {

    private int value;


    public Num(int num) {
        value = num;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Num{" +
                "value=" + value +
                '}';
    }
}
