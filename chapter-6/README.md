# Chapter 6 - Arrays

## Arrays
-   An array is simple but powerful way to group and organize data.
-   An array is a list of values. Each value is stores at a numbered position in the array.
-   The number for each position is called an **index** or **subscript**.




### How to Declare an array ?

-   In Java , Arrays are objects. To create an array, you must create a reference to the array.

```aidl
 int[] height = new int[11];

 int -> type
 height -> reference variable
 int[11] -> We are asking Java to create an array to store 11 elements. It cannot be changed.

```

![](https://github.com/dsaish3/Java-Training/blob/master/images/java-arrays-4.png)


-   Above declaration creates an int array of 11 elements.
-   An array will store the element of same type.
    -   In the above example height  cannot store double or float.
-   A value stores in an array is called **array element.**
-   The type of values an array stores is called **element type**.


### Difference between an int and int array:

```aidl
int a=10; //assigns the variable 'a' with value 10

int[] numArray = new int[5]; //intiliazes an empty array, all the values will be zero.

numArray[0]=1 //Filling/assigns a value at index 0
numArray[1]=3//Filling/assigns a value at index 1
numArray[2]=8//Filling/assigns a value at index 2
numArray[3]=23//Filling/assigns a value at index 3
numArray[4]=99//Filling/assigns a value at index 4
```

-   Index of the array aways starts with zero

![](https://github.com/dsaish3/Java-Training/blob/master/images/java-arrays-1.png)


### How to get the value of the index in an array ?

**Syntax**

```aidl
arrayReferenceVariable[index-number]
```

```
int[] height = new int[11];

indexes for the height array are -  0,1,2,3,4,5,6,7,8,9,10
```
-   The above example creates an array of 11 elements.

```aidl
 System.out.println(height[5]); -> This fetches the 6th element and prints its
```

### How to get the total length of an array?

-  **length** method will give your the total length of the array.

-   This **length** is different from the **length** in String.

```aidl
public class Arrays {

    public static void main(String[] args) {

        int[] height = new int[11];
        System.out.println(height.length); // prints the length of the array

    }
}
```
### How to iterate an array ?

-   Use **forloop** and **length** method to iterate an array.



**Forward Iteration**

**Example1**

```aidl
public class ArraysPractice {

    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i=0;i<ints.length;i++)
            System.out.println(ints[i]);

    }
}

```

**Example2 with Simplified Syntax**

```aidl
public class ArraysPractice {

    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i : ints)
            System.out.println(i);

    }
}

```

```
public class BasicArray {

    final static int LIMIT = 15;
    final static int MULTIPLE = 10;
    public static void main(String[] args) {

        int [] list = new int [LIMIT]; // creates an array of 15 elements

        for (int index=0; index < LIMIT;index++)
            list[index] = index * MULTIPLE;   // Adding an element to an array

        for (int index=0; index < LIMIT;index++)
            System.out.println(list[index] + " "); // Fetching an element fron a array
    }
}
```

**BackWard Iteration**

```aidl


public class ReverseOrder {

    public static void main(String[] args) {

        double[] numbers = new double[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("The size of the array : " + numbers.length);

        for(int index=0; index<numbers.length;index++){  //
            System.out.println( "Enter the value for " + index + " index ");
            numbers[index] = scanner.nextDouble();
        }

        for(int index= numbers.length-1; index >=0; index--){ // Always use array.length-1
            System.out.println(numbers[index] + " ");
        }

    }
}

```

**Count the uppercase and lowercse characters from a String**

```aidl
String name = "Dilip";

name.length() = > 5 // This will print the length of the String.

name[0] -> D
name[1] -> i
name[2] -> l
name[3] -> i
name[4] -> p
```
**ASCII Value of characters**

https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html

```
System.out.println('A'+1);
```
**Perform arithmetic operations with characters**
```aidl
if(66 > 'A'){
    System.out.println("Character A is less than 66");
    }

```

```aidl
public class LetterCount {

    public static void main(String[] args) {

        final int NUMCHARS = 26;
        Scanner scanner = new Scanner(System.in);
        char current;
        int other=0;

        int[] upper = new int [NUMCHARS];
        int[] lower = new int [NUMCHARS];

        System.out.println("Enter a sentence : ");

        String line = scanner.nextLine();

        System.out.println(" Length of the entered String : " + line.length());

        for(int ch=0;ch < line.length(); ch++){
            current = line.charAt(ch);
            if(current >= 'A' && current <='Z')
                upper[current-'A']++;
            else
                if(current >= 'a' && current<= 'z')
                    lower[current-'a']++;
                else
                    other++;
        }

        for(int letter=0; letter<upper.length; letter++){

            System.out.println( (char) (letter+'A') + ": " + upper[letter] +  "\t" + (char) (letter+'a') + ": "+  + lower[letter]);

        }
    }
}
```

## Initializer Lists:

-   An initializer list provides the initial values of the list.

```aidl
public class IntiliazerArray {

    public static void main(String[] args) {

        int[] primes = {2,3,5,7,11,13,17,19}; // intializer list of type int

        char[] grades = {'A','B','C','D'};  //  intializer list of type char
    }
}
```

### How Arrays store in memory?

-   Arrays are nothing but objects.
-   Its stores the arrays as like objects.
-   Reference variable and the Actually array with values.It gets stored like below.

![](https://github.com/dsaish3/Java-Training/blob/master/images/java-arrays-4.png)

![](https://github.com/dsaish3/Java-Training/blob/master/images/java-arrays-2.png)

### ArrayIndecOutOfBoundsException:

-   This exception will be thrown when you try to access an index that is out of range (not a valid one).

```aidl
public class ArrayIndexException {

    public static void main(String[] args) {

        int[] num = {1,2,3}; // available indexes are 0 ,1,2

        System.out.println(num[3]); // index 3 is not available, this will throw the exception.
    }
}


```

## Array as parameters:

-   We can pass array as parameters for a method. Because arrays are nothing but objects.
-   Changing the array elements inside the method will chage the actual array

```aidl
public class IntiliazerArray {

    public void changeIntArray(int[] arr){

        arr[arr.length-1] = 23; // this modifies the actual array.
    }

    public static void main(String[] args) {

        int[] primes = {2,3,5,7,11,13,17,19}; // intializer list of type int

        char[] grades = {'A','B','C','D'};  //  intializer list of type char

        IntiliazerArray intiliazerArray = new IntiliazerArray();

        intiliazerArray.changeIntArray(primes);

        for(int i=0;i<primes.length;i++){
            System.out.println(primes[i]);
        }
    }
}

```

## Arrays of Objects:

-   When we store objects in array , each element is a seperate object.
-   An array of objects is really an array of object references.
-   We all know String is an object.

```aidl
 String[] strings = new String[5];
```

### Initializer Array Objects:


```aidl
String[] grades = {"A","A-","B+","B-","C+","C-"};
```
### How arrays of objects are stores in memory ?


![](https://github.com/dsaish3/Java-Training/blob/master/images/java-arrays-3.jpg)

### Parrallel Arrays:

-   Two arrays with corresponding elements are called **parallel** arrays.

-   In the below example ,
    -   **grades** array is used to store the grades.
    -   **cutoff** array is used to store the grade number

```aidl
public class StringArray {
    public static void main(String[] args) {

        String[] grades = {"A","A-","B+","B-","C+","C-"}; // intialized array holds the grades

        int[] cutoff = {95,90,87,83,80, 77};// intialized array holds the grade marks

        for (int level=0; level < cutoff.length;level++){
            System.out.println(grades[level] + "\t" + cutoff[level]);
        }
    }
}
```

-   This is not recommended because this can easily go out of sync if one element is added or removed in the either one of the array.

### Command-Line:

-   Package is **com.learnJava.commandlinearguments**
-   Class is **NameTag**.

```aidl
package com.learnJava.commandlinearguments;

public class NameTag {

    public static void main(String[] args) { //formal parameters

        System.out.println();
        System.out.println("   " + args[0]);
    }
}
```

-   Two steps to compile and execute a Java file.
    -   compile **javac**
    -   execute/run **java**

#### How to check compile the java class file?

-   Use the **javac** command to compile the java class file.

-   Go to the root of the directory ie., **src**

-   Run the below command.

```aidl
javac com/learnJava/commandlinearguments/NameTag.java

```

-   The above command will create the **.class** file.

#### How to run/execute the compiled java class file?

-   Go to the root of the directory ie., **src**

-   Run the below command. **Dilip** is the first argument to the array.

```aidl
java com/learnJava/commandlinearguments/NameTag Dilip

```

-   **Dilip** will get printed because our program reads the value from the command and prints the first element in the array.

#### How to increase the size of the array dynamically ?

-   This example shows how to increase the size of the array dynamically.

**Example**
```aidl
public class IntegerArray {

    public int[] intArray = new int[5];
    int count=0;

    public void addValueToTheArray(int i){

        if(count == intArray.length){
            int[] temp = new int[intArray.length * 2]; //10 elements

            for(int j=-0;j<intArray.length;j++){
                temp[j]= intArray[j];
            }

        intArray = temp;
        }
        intArray[count] = i;
        count = count +1;

    }

    public void printArray(){

        for(int i : intArray){
            System.out.println(i);
        }
    }

}
```

**Client**

```aidl
public class IntegerArrayClient {

    public static void main(String[] args) {

        IntegerArray integerArray = new IntegerArray();

        integerArray.addValueToTheArray(1);
        integerArray.addValueToTheArray(10);
        integerArray.addValueToTheArray(20);
        integerArray.addValueToTheArray(33);
        integerArray.addValueToTheArray(100);
        integerArray.addValueToTheArray(200);
        integerArray.printArray();

    }
}

```

#### Filling Arrays as Objects:

-   Storing an object as an array. We have already seen String example. Here we will look at **CD** storing cd Object.

**CD**

```aidl
public class CD {

    private String title, artist;
    private double cost;
    private  int tracks;

    public CD(String title, String artist, double cost, int tracks) {
        this.title = title;
        this.artist = artist;
        this.cost = cost;
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", cost=" + cost +
                ", tracks=" + tracks +
                '}';
    }
}
```

**CDCollection:**

-   This class represents a collection of Cd's.

```aidl
public class CDCollection {

    private CD[] collection;
    private int count;
    private double totalCost;

    public CDCollection() {
        collection = new CD[2];
        count =0;
        totalCost =0.0;
    }

    public void addCD( String title, String artist, double cost, int tracks){

        if(count == collection.length){
            increaseSize();
        }
        collection[count] = new CD(title,artist,totalCost,tracks);
        totalCost+=cost;
        count++;

    }

    private void increaseSize() {

        CD[] temp = new CD[collection.length * 2];

        for(int cd =0; cd < collection.length; cd++){
            temp[cd] = collection[cd];
        }
        collection = temp;
    }

    @Override
    public String toString() {
        return "CDCollection{" +
                "collection=" + Arrays.toString(collection) +
                ", count=" + count +
                ", totalCost=" + totalCost +
                '}';
    }
}
```

**Tunes**

-   This is the driver class for CD collections.

```aidl
public class Tunes {

    public static void main(String[] args) {

        CDCollection music = new CDCollection();

        music.addCD("Song1","artist1", 20.0,3 );
        music.addCD("Song2","artist1", 30.0,10 );

        System.out.println(music);

        music.addCD("Song2","artist1", 30.0,10 ); // ArrayindexOutofBounds

    }
}
```

### Array Searching

-   A common problem with arrays is that searching for a particular element in the arrray.
-   Any item that we are looking for is called a **Target**.

#### Linear Search:

-   The most baisc search is the Linear search.
-   We look for each element in the array from the beginning until we reach the element we are looking for or we reach the end of the array.


**Example**

-   In this example the search starts from the 0th index and looks for that element until the last index in the array.

![](https://github.com/dsaish3/Java-Training/blob/master/images/linear-search.jpg)

```aidl
public class LinearSearch {

    public static void main(String[] args) {

        int[] ints= {3,15,2,8,7,1,14,25,38,10,-2,61,5};

        //to find 25

        int toFind=25;

        for(int i : ints){
            if(toFind == i){
                System.out.println("Found the Value :" + toFind);
            }
        }


    }
}
```
-   The main problem with this is that it can be slow while working with large amounts of data.

-   If there are 1000 elements, then the element we are looking for is at the 999th position then we need to iterate for 999 times.

**Example - Linear Search with a method:**

```aidl
public class LinearSearch1 {

    public int performLinearSearch(int[] numArray, int target){
        int[] ints= {3,15,2,8,7,1,14,25,38,10,-2,61,5};


        for(int i : ints){
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

        int target1 = 39;

        System.out.println(linearSearch1.performLinearSearch(intArray,target1 ));

    }
}

```

#### Binary Search:

-   Consider an array that has elements filled from smallest to the largest number.

![](https://github.com/dsaish3/Java-Training/blob/master/images/binary-search.png)

```aidl
int[] numArray = {2,4,5,7,8,9,12,14,17,19,22,25,27,28,33};
```

-   Lets say we are looking for the element **12**. Then the first step is that we will find out the value of the middle index in the array.

-    We are going to maintain three variables.
    -   low
    -   middle
    -   high
**Step 1**
-   The intial values are set as below:
```aidl
low = 0; high = 14(15(length-1); middle=7

```

**Step 2**

-   Determine the target value that you are looking for.
    -   In this example we are going to search for **12**
-   numArray[middle] is 14 and the value we are looking for is **12**.
    -   Is (14 != 12) and 0 <=14
        -   Is (12 < 14)
         -  **yes** -> Change the high and middle variables.
            -   high=middle-1
         -  **no** -> change the low and  middle variables.
            -   low = middle+1      
    - continue the process until you find the target value or low value is greater than high

```aidl
public class BinarySearchExample {

    public static void main(String[] args) {

        int[] numArray = {2,4,5,7,8,9,12,14,17,19,22,25,27,28,33};

        int low =0; int high = numArray.length-1; int middle = (low+high)/2;

        int target = 13;
        System.out.println("middele index value is : " + middle);
        System.out.println("middele index value is : " + numArray[middle]);

        while(numArray[middle] !=target && (low <= high)){
            System.out.println("inside the while");
            if(target < numArray[middle]){
                high = middle-1;
            }else{
                low = middle+1;
            }
            middle = (low+high)/2;
        }

        if(numArray[middle]==target){
            System.out.println("Found the Value  : " + numArray[middle]);
        }else
            System.out.println("No Match");
    }
}

```

### Sorting

-   Sorting is the process of arranging a list of items in order.
-   Two sorts are popular
    -   Selection sort
    -   insertion sort

#### Selection Sort:
-   Selection sort is a combination of sorting and searching.
-   During each iteration the smallest value will be found and moved to the appropriate position.
-   
-   The selection sort uses two for loops.
    -   outer loop -  controls where the next value will be stored.
    -   inner loop -  finds the smallest value in the rest of the list by scanning all positions.
