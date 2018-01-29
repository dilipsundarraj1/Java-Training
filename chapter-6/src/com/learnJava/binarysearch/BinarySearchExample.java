package com.learnJava.binarysearch;

/**
 * Created by z001qgd on 1/23/18.
 */
public class BinarySearchExample {

    public static void main(String[] args) {

       // int[] numArray = {2,4,7,11,14,15,23};
        int[] numArray = {2,4,5,7,8,9,12,14,17,19,22,25,27,28,33};
        System.out.println("Total length of the array : "+ numArray.length);

        int low =0; int high = numArray.length-1; int middle = (low+high)/2;

        int target = 13;
        System.out.println("middele index value is : " + middle);
        System.out.println("middele index value is : " + numArray[middle]);

        while(numArray[middle] !=target && (low <= high)){
            System.out.println("inside the while");
            if(target < numArray[middle]){
                high = middle-1;
            }else{
                low = middle+1;
            }
            middle = (low+high)/2;
        }

        if(numArray[middle]==target){
            System.out.println("Found the Value  : " + numArray[middle]);
        }else
            System.out.println("No Match");
    }
}
