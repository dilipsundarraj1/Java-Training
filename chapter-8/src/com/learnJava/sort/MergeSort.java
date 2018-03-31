package com.learnJava.sort;

public class MergeSort {

    public static void doMergeSort(int [] numbers, int start, int end){

        //System.out.println("start :" + start + "end : " + end);
        if(start<end){

            int middle = (start+end)/2;
            //System.out.println("middle value : " + middle);
            doMergeSort(numbers, start,middle);
            doMergeSort(numbers, middle+1,end);
            //iterateArray(numbers);
            merge(numbers,start,middle,end);
        }




    }

    private static void merge(int[] numbers, int start, int middle, int end) {
        System.out.println("inside merge");
        System.out.println("start : " + start +  ", middle :  " + middle  +" , end : " + end) ;

        for(int i : numbers){
            System.out.println("Before Sort :" + i);
        }

        int[] tmp = new int[end-start+1];

        int index1 = start;
        int index2=middle+1;
        int indexTmp=0;
        while(index1<=middle && index2<=end){

            if(numbers[index1] < numbers[index2]){
                tmp[indexTmp] = numbers[index1];
                index1++;
            }else{

                tmp[indexTmp]= numbers[index2];
                index2++;
            }
            indexTmp++;
        }

        while(index1 <=middle){
            tmp[indexTmp]=numbers[index1];
            index1++;
            indexTmp++;

        }

        while(index2<=end){
            tmp[indexTmp]=numbers[index2];
            index2++;
            indexTmp++;
        }

        for(indexTmp=0;indexTmp<tmp.length;indexTmp++){

            numbers[start+indexTmp]=tmp[indexTmp];
        }


        iterateArray(numbers);
    }

    private static void iterateArray(int[] numbers) {
        //System.out.println("Inside Iterate array");
        for(int i : numbers)
            System.out.println("After Sort " + i);

    }

    public static void main(String[] args) {

       int[] grades = {89,94,69,80,97,85,73,77};
       // int[] grades = {4,3,2,1}; //1,2,3,4

        doMergeSort(grades, 0, grades.length-1);
    }
}
