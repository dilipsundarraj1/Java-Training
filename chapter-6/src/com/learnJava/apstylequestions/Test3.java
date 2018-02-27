package com.learnJava.apstylequestions;

public class Test3 {
    private int[] nums;

    public void doStuff(int n){

        for(int i=0;i<nums.length; i++){
            if(nums[i]>n)
                nums[i]=0;
        }
    }

    boolean hasDuplicate(int [] nums){

        for(int k=0; k <nums.length-1;k++){
            if(nums[k] == nums[k+1])
            return true;
        }

        return false;

    }

    public void modParams(int[] x, int [] y, String[] s){

        x[1]=5;
        y=x;
        s[1]=new String("five");
        s = new String[3];
        s[1]= new String("six");
    }

    public void print(){
        int[] a = {1,2,3};
        int[] b = {11,22,33};
        String[] s = {"one","two","three"};

        modParams(a,b,s);

        System.out.println(a[1] + " " + b[1]+" "+s[1]);
    }

    public static void main(String[] args) {

new Test3().print();
    }
}
