# Recursive Programming

-   This is a technique in which a method calls itself.\

## Recursion in Math

```aidl
3! = 3 * 2 * 1 
```

### Recursion Example:

```aidl
package com.learnJava.recursion;

public class RecursionExample {

    public static int sumUsingRecursion(int num){

        int result;
        if(num==1)
            result=1;
        else{
            result = num+sumUsingRecursion(num-1);

        }
        return  result;

    }

    public static void main(String[] args) {

        System.out.println(sumUsingRecursion(5));
    }
}

```

#### Recursion vs Iteration

-   The same summation problem can be solved using iteration as per the below example.

```aidl
 public static int sumUsingRecursion(int num){

        int result;
        if(num==1)
            result=1;
        else{
            result = num+sumUsingRecursion(num-1);

        }
        return  result;

    }

    public static int sumUsingIteration(int num){

        int result=0;
       for(int number=1;number<=num;number++){
           result+=number;
       }
        return  result;

    }
```

### Merge Sort:

-   The time complexity of merge sort is **O(nlogn)**.

```aidl
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

```

### Quick Sort:

-   The time complexity of quick sort is **O(nlogn)**.

```aidl
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

```