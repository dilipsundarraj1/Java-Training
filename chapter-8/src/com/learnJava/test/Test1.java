package com.learnJava.test;

public class Test1 {

   static int mystery(int w){
       System.out.println("value of w is : " + w);
        if(w<0){
            return 0;
        }
        int x = mystery(w-2);
       int result = w-x;
       System.out.println("result is : " + result);
        return result;
    }

    static void arrayTraverse(int curIndex, int[] array){

       if(curIndex == array.length)
           return;
        System.out.println(array[curIndex]);
       arrayTraverse(curIndex+1,array);
    }

    public static void main(String[] args) {


        System.out.println(mystery(5));

        /*int numbers[] = {1,2,3,4};
        arrayTraverse(0, numbers);*/
    }
}
