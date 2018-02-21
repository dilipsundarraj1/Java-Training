package com.learnJava.linearsearch;

/**
 * Created by z001qgd on 1/23/18.
 */
public class LinearSearch1 {

    public int performLinearSearch(int[] numArray, int target){


        for(int i : numArray){
            if(target == i){
                System.out.println("Found the Value :" + target);
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] intArray= {3,15,2,8,7,1,14,25,38,10,-2,61,5};

       LinearSearch1 linearSearch1 = new LinearSearch1();
        int target = 38;

        System.out.println(linearSearch1.performLinearSearch(intArray,target ));

        /*int target1 = 39;

        System.out.println(linearSearch1.performLinearSearch(intArray,target1 ));
*/
    }
}
