package com.learnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalTest {

   static  private List<Integer> nums = Arrays.asList(0, 0, 4, 2, 5, 0, 3);


    public static void problem1(){

        int[][] m = {{1,1,1,1},
                {1,2,3,4},
                {2,2,2,2},
                {2,4,6,8}};



        int sum = 0;
        //System.out.println("Length of the array : " + m.length);
        for (int k = 0; k < m.length; k++) {
            sum = sum + m[m.length-1-k][1];
        }

        System.out.println("Result of problem 1 : " + sum);

    }

    public static void problem2() {

        //List<Integer> nums = Arrays.asList(0, 0, 4, 2, 5, 0, 3);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(0);
        nums.add(4);
        nums.add(2);
        nums.add(5);
        nums.add(0);
        nums.add(3);
        int k = 0;
        int zero = 0;
        while (k < nums.size()) {
            if (nums.get(k).equals(zero))
                nums.remove(k);
            else
                k++;
        }

        System.out.println("Result of problem 2 : " + nums);

    }

    public static void problem3(){

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(1);

        nums.add(6); // 5 , 3 , 1 ,6
        nums.add(0,4); // 4,5,3,1,6
        nums.remove(1); //4,3,1,6
        System.out.println("Result of problem 3 : " + nums);
    }

    public  static void problem4(){

        int count=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               // System.out.println("*");
                count++;
            }
        }
        System.out.println("Result of Problem 4 : " + count);
    }

    public static void problem6(){
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b"); // a,b
        list1.add(0,"c"); // c,a,b
        list1.add(1, "d"); //c,d,a,b
        list1.set(2, "e");//c,d,e,a,b
        list1.add("f");//c,d,e,b,f


        System.out.println("Result of Problem 6 : " + list1);
    }


    public static boolean problem7(String s)
    {
        return s.length() >= 2 &&
                (s.charAt(0) == s.charAt(1) ||
                        problem7(s.substring(1)));
    }

    public static void problem8(){

        int[][] arr = {{3,2,1},{1,2,3}};
        int value = 0;
        for (int row = 1; row < arr.length; row++) {
            for (int col = 1; col < arr[0].length; col++) {
                if (arr[row][col] % 2 == 1)
                {
                    arr[row][col] = arr[row][col] + 1;
                }
                if (arr[row][col] % 2 == 0)
                {
                    arr[row][col] = arr[row][col] * 2;
                }
            }
        }

        System.out.println("Result of problem 8 : is option c");
        for(int i=0; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void problem10(){

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("Result of problem 10 : is Option 1");
    }


    public static int problem11(int n)
    {
        System.out.println("n value is : " + n);
        if(n == 1)
            return 1;
        else
            return n * problem11(n - 2);
    }

    public static int problem12(int bunnies){

        System.out.println("Result of bunnies variable : " +  bunnies);
        if (bunnies == 0)
            return 0;
        else if
                (bunnies == 1) return 2;
        else
            return 2 + problem12(bunnies - 1);

    }

    public static void problem13(){
        int count=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                //System.out.println("*");
                count++;
            }
        }
        System.out.println("Result of Problem 13 : " + count);

    }



    public static void problem14(){
        int var1 = 0;
        int var2 = 2;

        while ((var2 != 0) && ((var1 / var2) >= 0)) {
            var1 = var1 + 1;
            var2 = var2 - 1;
        }

        System.out.println("var1 : " + var1 + ", var2 : " + var2);
    }

    public static void problem15(){
        String s1 = new String("Hi There");
        String s2 = new String("Hi There");
        String s3 = s1;
        /*System.out.println("Option 1 :" + (s1 == s2));
        System.out.println("Option 2 :" + s1.equals(s2));
        System.out.println("Option 3 :" + (s1 == s3));
        System.out.println("Option 4 :" + (s2.equals(s3)));*/
        System.out.println("Result of problem 15 is : 2,3 and 4");
    }

    public static void problem16(){
        String s = "Georgia Tech";
        String s1 = s.substring(0,7);
        //System.out.println("s1 " + s1);
        String s2 = s1.substring(2);
        //System.out.println("s2 " + s2);
        String s3 = s2.substring(0,3);
        System.out.println(s3);
    }

    public static int mystery(int n)
    {
        if (n == 0)
            return 1;
        else
            return 3 * mystery (n - 1);
    }

    public static void problem18(){
        for (int s = 1; s <=100; s++) {
            for (int m = 1; m <= 100; m++) {
                if ((s == (m + 5)) && ((s + 3) == (2 * m + 3)))
                    System.out.println("Susan is " + s + " and Matt is " + m);
            }
        }
    }

    public static void problem19(){

        int [][] mat = new int [4][3];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (row < col)
                    mat[row][col] = 1;
                else if (row == col)
                    mat[row][col] = 2;
                else
                    mat[row][col] = 3; } }
        System.out.println("The result of Problem 19 is : Option B");
        for(int i=0; i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

    }

    public static void problem20(){
        System.out.println("in problem 20");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(0);
        nums.add(4);
        nums.add(2);
        nums.add(5);
        nums.add(0);
        nums.add(3);
        nums.add(0);
        int k=0;
        Integer zero = new Integer (0);
        while (k < nums.size())  {
            if(nums.get(k).equals(zero))
                nums.remove(k);
            else
                k++;
        }
        System.out.println("Result of problem 20 : "+ nums);

    }


    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
        problem4();
        problem6();
        System.out.println("Result of problem 7 is : "+ problem7("sdfsbaa") + " answer is B, C, D" );
        problem8();
        problem10();
        System.out.println("Result of the probelem 11 is "+ problem11(3));
        System.out.println("Result of the probelem 11 is "+ problem12(3));
        problem13();
        problem14();
        problem15();
        problem16();
        System.out.println("Result of Problem 17 is : "+mystery(5));
        problem18();

        problem19();
        problem20();
    }

}
