package com.learnJava.sort;

public class InsertionSort {

    public static void insertionSort(int[] numbers){


        for(int index=1; index<numbers.length;index++){

            int key =  numbers[index];
            int position =index;

            while (position>0 && numbers[position-1]>key){//
                numbers[position] = numbers[position-1];
                position--;
            }
            numbers[position] = key;
        }

    }

    public static void main(String[] args) {

        int[] numArray = {5,4,3,21,1};

        insertionSort(numArray);

        for(int val : numArray){
            System.out.println(val);
        }


    }
}
