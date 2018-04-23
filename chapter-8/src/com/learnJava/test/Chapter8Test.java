package com.learnJava.test;

public class Chapter8Test {

    public int noBaseCase(int x){

        System.out.println("inside noBaseCase");
        if(x>0){
           // return noBaseCase(x-1)+1;
            return 0;
        }

        else
            return  noBaseCase(x-2)+2;
    }

    public int question5(String a,char b , int i){

        if(i==a.length())
            return 0;
        else if(b==a.charAt(i))
            return question5(a,b,i+1)+1;
        else
            return question5(a,b,i+1);
    }

    public int find8Up(int[] studentsAge, int x){

        if(studentsAge.length == x){
         return 0;
        }else {
            if(studentsAge[x]>=8){
                return 1+find8Up(studentsAge,x+1);
            }else{
                return find8Up(studentsAge,x+1);
            }
        }

    }

    public String doSomething(String[] studentsAge, int x){


        if(x==0){
            return "";
        }else {

            return studentsAge[x-1]+doSomething(studentsAge,x-1);
        }

    }

    public static void main(String[] args) {

        new Chapter8Test().noBaseCase(5);

        System.out.println( new Chapter8Test().question5("Esha",'P',0));

        int[] studentsAge = {10,11,9,8,6};

        System.out.println(new Chapter8Test().find8Up(studentsAge,0));

        String[] a = {"a","b","c","d","e"};
        String result="";

        System.out.println( new Chapter8Test().doSomething(a, a.length));

    }
}
