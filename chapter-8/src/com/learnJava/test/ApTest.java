package com.learnJava.test;

public class ApTest {


    //1 -> Ans c
    public int powerOf2(int power){

        if(power == 0)
            return 1;
        else
            return 2 * powerOf2(power-1);
    }

    //2-> ANS a
    public int multiply(int num1,int num2){

        if(num2==0){
            return 0;
        }
        else{
            return num1+multiply(num1, num2-1);
        }
    }

    //3 -> prints str x-1 times, ANS a
    public void doIt(String str, int x){

        if(x>1){
            System.out.println(str);
            doIt(str,x-1);
        }
    }

    //4->ANS D
    public void mystery(int x){

        if(x<0)
            mystery(0-x);

        System.out.print(x);

        if(x>2)
            mystery(x-3);

        System.out.print(x);
    }

    //5,6
    public int process(int k, int[] a){

        if(k<a.length)
            return  a[k]+process(k+2,a);
        else
            return 0;
    }

    //5options check -> ANs C (I and II only)
    public void optionsCheck5(int[] a){
        int result =0;

        for (int k=3; k< a.length;k=k+2){
            result = result + a[k];
        }
        System.out.println("option 1 result : " + result);

        result =0;
        int k=3;
        while (k<a.length){
            result = result + a[k];
            k=k+2;
        }
        System.out.println("option 2 result is : "+ result);

        result=0;
        for(int j:a){
            result = result+j;
            j=j+2;

        }
        System.out.println("option 3 result is : " + result);


    }

    public static void main(String[] args) {

        ApTest apTest = new ApTest();
        System.out.println(apTest.powerOf2(4));

        System.out.println("Ans 2 : " + apTest.multiply(5,3));

        apTest.doIt("hello", 4);

        apTest.mystery(-3);

        int[] a ={1,2,3,4}; //10
        int result = apTest.process(3,a);

        System.out.println("result is " + result);

        apTest.optionsCheck5(a);

        int[] a1 ={1,2};
        int resultOption6 = apTest.process(0,a1)+apTest.process(1,a1);

        System.out.println("result is " + resultOption6);



    }
}
