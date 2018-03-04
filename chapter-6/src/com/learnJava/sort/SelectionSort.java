package com.learnJava.sort;

/**
 * Created by z001qgd on 1/31/18.
 */
public class SelectionSort {

    private static void sort(int[] grades) {

        int  temp,minValue,minIndex=0;
        for(int index=0;index<grades.length-1; index++){// outerLoop
            minIndex= index;
            minValue=grades[index];

            for(int scan=index+1;scan<grades.length;scan++){ //innerloop starts at the first unsorted item.
                    if(grades[scan] < grades[minIndex]){
                        minIndex=scan;
                        minValue=grades[scan];
                    }
            }

            if(minValue < grades[index]){
                temp = grades[minIndex]; // assigns the minimum value to the
                grades[minIndex] = grades[index]; // moves the value in the current index to the minIndex position
                grades[index] = temp; // moves the minimum value to the current index position
            }

        }

    }

    public static void main(String[] args) {

        int[] numbers = {5,4,1,3,2};
        //int[] numbers = {9,4,12,2,6,8,18};

        SelectionSort.sort(numbers);

        for (int grade:numbers){
            System.out.println(grade);
        }
    }


}
