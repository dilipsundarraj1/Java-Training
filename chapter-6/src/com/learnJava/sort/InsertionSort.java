package com.learnJava.sort;

public class InsertionSort {

    public static void insertionSort(int[] numbers){

        int count=0;
        for(int index=1; index<numbers.length;index++){
            count = count +1;
            int key =  numbers[index];
            int position =index;

            while (position>0 && numbers[position-1]>key){//
                numbers[position] = numbers[position-1];
                position--;
            }
            numbers[position] = key;

        }

        System.out.println("No of passes : " + count);



    }

    public static void main(String[] args) {

        int[] numArray = {5,4,3,21,1};

        /*int[] numArray = {9,4,12,2,6,8,18};*/

        insertionSort(numArray);

        for(int val : numArray){
            System.out.println(val);
        }


    }
}
