package com.learnJava.arrays;

/**
 * Created by z001qgd on 1/8/18.
 */
public class IntiliazerArray {

    public void changeIntArray(int[] arr){

        arr[arr.length-1] = 23;
    }

    public static void main(String[] args) {

        int[] primes = {2,3,5,7,11,13,17,19}; // intializer list of type int

        char[] grades = {'A','B','C','D'};  //  intializer list of type char

        IntiliazerArray intiliazerArray = new IntiliazerArray();

        intiliazerArray.changeIntArray(primes);

        for(int i=0;i<primes.length;i++){
            System.out.println(primes[i]);
        }
    }
}
