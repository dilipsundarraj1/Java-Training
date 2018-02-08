package com.learnJava.sort;

/**
 * Created by z001qgd on 1/31/18.
 */
public class SelectionSort {

    private static void sort(int[] grades) {

        int min, temp;

        for(int index=0;index<grades.length-1; index++){

            min= index;

            for(int scan=index+1;scan<grades.length;scan++){
                    if(grades[scan] < grades[min])
                        min=scan;
            }

            temp = grades[min];
            grades[min] = grades[index];
            grades[index] = temp;
        }
    }

    public static void main(String[] args) {

        int[] grades = {89,94,69,80,97,85,73,91,77,85,93};

        SelectionSort.sort(grades);

        for (int grade:grades){
            System.out.println(grade);
        }
    }


}
