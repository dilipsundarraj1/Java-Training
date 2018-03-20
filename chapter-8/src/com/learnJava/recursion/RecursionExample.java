package com.learnJava.recursion;

public class RecursionExample {

    public static int sumUsingRecursion(int num){

        int result;
        if(num==1)
            result=1;
        else{
            result = num+sumUsingRecursion(num-1);

        }
        return  result;

    }

    public static int sumUsingIteration(int num){

        int result=0;
       for(int number=1;number<=num;number++){
           result+=number;
       }
        return  result;

    }

    public static void main(String[] args) {

        System.out.println(sumUsingRecursion(5));
        System.out.println(sumUsingIteration(5));
    }
}
