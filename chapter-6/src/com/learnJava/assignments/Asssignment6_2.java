package com.learnJava.assignments;

import java.util.Scanner;

/**
 * Created by z001qgd on 1/30/18.
 */
public class Asssignment6_2 {

    public static void main(String[] args) {

        int start=-25;
        int end=25;
        int[] numArray = new int[51]; // initialized the array of 51 elements
        int[] resultArray = new int[51];

        int count=0;
        for(int i=start;i<=end;i++){
            numArray[count++] =i;
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of Integers you are going to enter:");
        int numberOfIntegers = s.nextInt();

        Scanner numScanner = new Scanner(System.in);
        int num=0;
        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.println("Enter number " + (i+1));
            num = numScanner.nextInt();
            if(num>=start && num<=end){
                resultArray[end+num]++;
            }else{
                System.out.println(num + " is  out of the range.");
            }
            num=0;
        }

        for (int i=0;i<numArray.length;i++ ){
            System.out.println("Number :" + numArray[i] +" Repeat Times : " + resultArray[i] );
        }



    }

}
