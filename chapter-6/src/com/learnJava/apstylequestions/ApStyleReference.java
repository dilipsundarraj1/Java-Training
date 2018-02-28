package com.learnJava.apstylequestions;

public class ApStyleReference {

    static int  row = 2;
    static int  column = 2;

    static  int row_10=10;
    static  int column_10=10;

    public  static int[] putTogether(int [] a, int[] b){

        int c[] = new int[a.length+b.length];
        int index=0;

        for(int i=0; i<a.length;i++){
            c[index]=a[i];
            index=index+1;
        }

        for(int i=0; i<b.length;i++){
            c[index]=b[i];
            index=index+1;
        }

        for(int d : c){
            System.out.println(d);
        }

        return c;
    }

    public static int[] sumArray(int[][] numArray){

        int result=0;
        int[] resultArray=new int[1];
        for(int i=0;i<row;i++){

            for(int j=0;j<column;j++){

                result+=numArray[i][j];
            }

        }

        resultArray[0]=result;

        return  resultArray;

    }

    public static void main(String[] args) {

        int[] a=  {1,2,3};

        int[] b=  {4,5,6};

        /*ApStyleReference apStyleReference = new ApStyleReference();

        apStyleReference.putTogether(a,b);
*/
        putTogether(a,b);


        int[][] numArray = new int[row][column];
        for(int i=0;i<row;i++){

            for(int j=0;j<column;j++){

                numArray[i][j] = 2;
            }

        }
        int[] result = sumArray(numArray);

        //System.out.println(result[0]);

        int[][] numArray1 = new int[row_10][column_10];

        /**
         * Fill the array with i *j
         */
        for(int i=0;i<row_10;i++){

            for(int j=0;j<column_10;j++){

                numArray1[i][j] = i*j;
            }

        }

        /**
         * print the array
         */
        for(int i=0;i<row_10;i++){

            for(int j=0;j<column_10;j++){

                System.out.println(numArray1[i][j]);;
            }

        }
    }
}
