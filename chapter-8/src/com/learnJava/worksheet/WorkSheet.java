package com.learnJava.worksheet;

public class WorkSheet {

    public void mystery1(int nNum){

        if(nNum<=0)
            return;
        else {
            System.out.println(nNum);
            mystery1(nNum-1);
        }
    }

    public void mystery2(int nNum){

        if(nNum<=0)
            return;
        System.out.println(nNum);
        mystery2(nNum-1);

    }

    public void mystery3(int nNum){

        if(nNum<=0)
            return;
       for(int nI=0;nI<nNum;nI++)
           System.out.println("-");
       for(int nI=0;nI<nNum;nI++)
           System.out.println("+");
        System.out.println();
        mystery3(nNum-1);

    }

    public int mystery4(int nNum){

        if(nNum > 1)
            return nNum * mystery4(nNum-2);
        else
            return 2;

    }

    public int mystery5(int k, int n){

        if(n==k)
            return k;
        else
            if(n>k)
                return mystery5(k,n-k);
            else
                return mystery5(k-n,n);

    }

    public void mystety6(String sWord){

        int nL = sWord.length();
        if(nL >1){
            String sTemp=sWord.substring(nL/2,nL); //4,8 -> 4,5,6,7
           // System.out.println("before : " + sTemp);
            mystety6(sTemp);
            System.out.println("after : " + sTemp);
        }
    }

    public void mystery7(String sWord){
        int nL = sWord.length();
        if(nL>=3){
            mystery7(sWord.substring(0,nL/3));
            System.out.println(sWord.substring(0,nL/3));
            mystery7(sWord.substring(0,nL/3));

        }
    }

    public void mystery8(String sWord){
        int nL = sWord.length();
        if(nL>=3){
            mystery8(sWord.substring(0,nL/3));
            System.out.println(sWord.substring(nL/3, 2*nL/3));
            mystery8(sWord.substring(2*nL/3));

        }
    }

    public static void main(String[] args) {

        WorkSheet  workSheet = new WorkSheet();
        //workSheet.mystery1(5);

       // workSheet.mystery2(5);

        //workSheet.mystery3(4);

        //System.out.println(workSheet.mystery4(4));
        //System.out.println(workSheet.mystery4(4));
     //   System.out.println(workSheet.mystery5(6,8));

       // workSheet.mystety6("abcdefgh");
        //String name = "Esha";//0,1,2,3
       // System.out.println(name.substring(1,3));
        //workSheet.mystery7("abcdefghijkl");
        workSheet.mystery8("la-la-la");
    }



}
