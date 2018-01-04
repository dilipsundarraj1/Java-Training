package com.learnJava.passobjects;

/**
 * Created by z001qgd on 1/4/18.
 */
public class ParameterChanger {

    public void changeValues(int f1, Num f2, Num f3){

        f1 = 999;
        f2.setValue(888);
        f3 = new Num(777);
    }
}
