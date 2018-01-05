package com.learnJava.apstylequestions;

/**
 * Created by z001qgd on 1/5/18.
 */
public class Test {

    private String testName;

    public Test(String testName) {
        this.testName = testName;
    }

    public void printTestName(){
        System.out.println(this.testName);
    }

    public static void main(String[] args) {

            Test test1 = new Test("Java Test");
            test1.printTestName();;
            Test test2 = new Test("Java Test1");
            test2.printTestName();;

        Test test3;
    }
}
