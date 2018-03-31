package com.learnJava.sort;

public class QuickSort {

    public static void doQuickSort( int [] numbers, int start,int end){

        if (start<end){
            int middle = partition(numbers,start,end);
            System.out.println("Middle : " + middle );
            doQuickSort(numbers,start,middle);
            doQuickSort(numbers,middle+1,end);

        }

    }

    private static int partition(int[] numbers, int start, int end) {

        int pivot = numbers[start];
        System.out.println("pivot : " + pivot + " , Start :" +start +" , end : "+ end);
        int i = start -1;
        int j = end +1;

        while(true){

            i= i+1;

            while(numbers[i]<pivot)
                i=i+1;

            j=j-1;
            while(numbers[j]>pivot)
                j=j-1;

            if(i<j){
                int tmp = numbers[i];
                numbers[i]= numbers[j];
                numbers[j]=tmp;
            }else
                return j;


        }



    }
    private static void iterateArray(int[] numbers) {
        //System.out.println("Inside Iterate array");
        for(int i : numbers)
            System.out.println("After Sort " + i);

    }


    public static void main(String[] args) {
       // int[] grades = {89,94,69,80,97,85,73,77};
         int[] grades = {4,3,2,5,1}; //1,2,3,4

        doQuickSort(grades, 0 , grades.length-1);

    }
}
