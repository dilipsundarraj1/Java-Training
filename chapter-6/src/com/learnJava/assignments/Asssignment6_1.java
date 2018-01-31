package com.learnJava.assignments;

import java.util.Scanner;

/**
 * Created by z001qgd on 1/30/18.
 */
public class Asssignment6_1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of Integers you are going to enter:");
        int numberOfIntegers = s.nextInt();
        int start=0;
        int end=50;
        int[] numArray = new int[51]; // initialized the array of 51 elements
        int[] resultArray = new int[51];
        int count=0;
        for(int i=start;i<=end;i++){
            numArray[count++] =i;
        }


        Scanner numScanner = new Scanner(System.in);
        int num=0;
        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.println("Enter number " + (i+1));
            num = numScanner.nextInt();
            if(num>=start && num<=end){
                resultArray[start+num]++;
            }else{
                System.out.println(num + " is  out of the range.");
            }
            num=0;
        }

        System.out.println("Entered Numbers and their repeated times are");

       for(int val=0;val<numArray.length ; val++){
           System.out.println("Number :" + numArray[val] +" Repeat Times : " + resultArray[val] );
       }
    }
}
