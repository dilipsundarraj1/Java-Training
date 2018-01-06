package com.learnJava.comparable;

/**
 * Created by z001qgd on 1/5/18.
 */
public class Num implements Comparable {

    private int value;

    public Num(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {

        Num num = (Num) o ;
        int otherValue = num.getValue();

        if(value < otherValue)
            return -1;
        else if (value > otherValue)
            return 1;
        else
            return 0;
    }

}
