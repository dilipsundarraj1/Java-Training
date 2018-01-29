package com.learnJava.binarysearch;

/**
 * Created by z001qgd on 1/23/18.
 */
public class BinarySearchExample {

    public static void main(String[] args) {

       // int[] numArray = {2,4,7,11,14,15,23};
        int[] numArray = {5,12,17,23,38,44,77,84,90};

        int low =0; int high = numArray.length-1; int middle = (low+high)/2;

        int target = 14;

        System.out.println("middele index value is : " + middle);

        while(numArray[middle] !=target){

            if(target < numArray[middle])
                high = middle-1;
            else
                low = middle+1;

            middle = (low+high)/2;
        }

        if(numArray[middle]==target){
            System.out.println("Expected Value is : " + numArray[middle]);
        }else
            System.out.println("No Match");
    }
}
