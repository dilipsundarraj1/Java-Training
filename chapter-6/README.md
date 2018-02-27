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

-   Arrays needs to be sorted for Binary Search to work better.

![](https://github.com/dsaish3/Java-Training/blob/master/images/binary-search.png)

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

#### Steps:
-    We are going to maintain three variables.
    -   low - 0 (first index)
    -   middle - (low+high/2)
    -   high - (last index)
-   The first check is that we will check the middle element.
-   Is my middle value not equal to the target value?

**target equals middle element**

-   That's it we found the value

**target is less than middle element**

-   Change the high value to (middle -1) and repeat the while loop

**target is greater than middle element**

-   Change the low value to (middle+1) and repeat the while loop.

###  Comparing Searches:

-   Binary search performs best compared to the Linear Search but it needs the data to be sorted.

-   So Always choose the algorithm based on the situation.


### Sorting

-   Sorting is the process of arranging a list of items in order.
-   Two sorts are popular
    -   Selection sort
    -   insertion sort

#### Selection Sort:
-   Selection sort is a combination of sorting and searching.
-   During each iteration the smallest value will be found and moved to the appropriate position.
-   The selection sort uses two for loops.
    -   outer loop -  controls where the next value will be stored.
    -   inner loop -  finds the smallest value in the rest of the list by scanning all positions.

```aidl
package com.learnJava.sort;

/**
 * Created by z001qgd on 1/31/18.
 */
public class SelectionSort {

    private static void sort(int[] grades) {

        int  temp,minValue,minIndex=0;

        for(int index=0;index<grades.length-1; index++){// outerLoop

            minIndex= index;
            minValue=grades[index];

            for(int scan=index+1;scan<grades.length;scan++){ //innerloop starts at the first unsorted item.
                    if(grades[scan] < grades[minIndex]){
                        minIndex=scan;
                        minValue=grades[scan];
                    }
            }

            if(minValue < grades[index]){
                temp = grades[minIndex]; // assigns the minimum value to the
                grades[minIndex] = grades[index]; // moves the value in the current index to the minIndex position
                grades[index] = temp; // moves the minimum value to the current index position
            }


        }
    }

    public static void main(String[] args) {

        int[] grades = {89,94,69,80,97,85,73,91,77,85,93};

        SelectionSort.sort(grades);

        for (int grade:grades){
            System.out.println(grade);
        }
    }


}
```

#### Insertion Sort:

-   The insertion sort starts the sort process by starting with the first index.
-   It checks the value to the left is smaller than the current value if yes then swap and continues the process with the rest of the elements.
-   The idea is this type of sort makes sure that all the items to the left are smaller and sorted.
-   Start with the first index in the array and compare the values prior to that index is sorted in increasing order.

##### How it works ?
-   Set the **key** value which is the current index value.
-   Compare the **key** value with the all the values prior to the current index and swap the values.
-   We are going to use a combination of for loop and a while loop.

```
public class InsertionSort {

    public static void insertionSort(int[] numbers){


        for(int index=1; index<numbers.length;index++){

            int key =  numbers[index];
            int position =index;

            while (position>0 && numbers[position-1]>key){//
                numbers[position] = numbers[position-1];
                position--;
            }
            numbers[position] = key;
        }

    }

    public static void main(String[] args) {

        int[] numArray = {5,4,3,21,1};

        insertionSort(numArray);

        for(int val : numArray){
            System.out.println(val);
        }


    }
}
```
### Sorting an Array Of Objects

-   We are going to use **insertion** sort in this example.
-   We will use **Comparable** interface.
    - Comparable interface has a method **compareTo** to compare the values and returns an integer.

**Contact**

```aidl
public class Contact implements  Comparable{

    private String firstName, lastName, phone;

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        int result;

        Contact temp = (Contact) o;

        if(firstName.equals((temp.lastName)))
            return firstName.compareTo(firstName);
        else
            return lastName.compareTo(temp.lastName);

    }
}

```
**SortPhoneList**
```aidl
package com.learnJava.sort;

public class SortPhoneList {

    public static void insertionSort(Comparable[] contacts){

        for(int index=1; index<contacts.length; index++){
            Comparable key = contacts[index];
            int position = index;

            while(position>0 && contacts[position-1].compareTo(key) > 0 ){
                contacts[position] = contacts[position-1];
                position--;
            }

            contacts[position] = key;

        }
    }

    public static void main(String[] args) {

        Contact[] friends = new Contact[4];
        Contact contact1 = new Contact("Ben","DEF", "12345");
        Contact contact2 = new Contact("Adam","ABC", "12345");
        Contact contact4 = new Contact("Mathew","ABC", "12345");
        Contact contact3 = new Contact("Dan","XYZ", "12345");

        friends[0] = contact1;
        friends[1] = contact2;
        friends[2] = contact3;
        friends[3] = contact4;


        System.out.println("**** Before Sort ****");
        for(Contact contact :  friends){
            System.out.println(contact);
        }

        insertionSort(friends);
        System.out.println("**** After Sort ****");

        for(Contact contact :  friends){
            System.out.println(contact);
        }


     }
}

```

### Comparing Sorts:

-   Efficiency is the first thing to look for.
    -   **Space Efficiency** - Refers to the amount of space that an algorithm uses.
    -   **Time Efficeincy** - Refers to how long it taken alogirthm to run.
-   An algorithm that uses less memory and Space is more efficeint.
-   **Big Oh** notation is the way to determine how efficient an algorithm is.

#### How efficiency is measured?

-   Efficiency is measured by the size of the input.
-   For a sorting algorithm the input is the array of the elements to be sorted.
-   We will use **n** for the size of the elements.
-   We can measure the **time efficiency** by calculating the number of times a statement gets executed with the input values.
    -   The important thing here is that how the running time grows with the input.
-   In sorting algorithm the common operation is comparison, so in here how the comparison grows with the input values.

#### Time Efficiency:
**Selection Sort:**
    -   Selection sort has an outerloop that iterates **n-1** times.
        -   Inner loop that iterates for 1 to n-1 times based on the index.
    -   So the **Big-oh** notation for selection sort is **O(n^2)**
    -   This means that selection sort is no worse than on the order of n^2 unit of time.

**Insertion Sort**
    -   Its two nested loops which runs n times each. so that each statement runs **n^2** times.
    -   So the **Big-oh** notation for insertion sort is **O(n^2)**
-   An algorithm that was **O(n)** would be more efficienct then one that **O(n^2)**.
-   LikeWise **O(n^3)** and **O(2^n)** is less efficient than **O(n^2).
         
#### Space Efficiency:

-   The amount of space being used is equivalent to the number of elements.
-   The Big oh notation for selection and insertion sort is **O(n)**.

So the conclusion is both **insertion** and **selection** sort has same efficiency.

-   Selection sort is easy to understand because each value moves to its final place in the list.
-   Although both have the same efficiency selection sort makes few swaps.

### Two Dimensional Array:

-   We have already discussed about it while discussing the **MysteryBoard** example.

```aidl
public class MysteryBoard {

    int row = 5;
    int column = 5;

    String[][] mystery = new String[row][column];

    Random rand = new Random();


    public MysteryBoard(){

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                mystery[i][j] = "-";
            }
        }
    }

    public void setMystery(){

        mystery[rand.nextInt(row)][rand.nextInt(column)] = "*";

    }

    public void guess(){

        int guess1 = rand.nextInt(row);
        int guess2 = rand.nextInt(row);
        if(mystery[guess1][guess2].equals("*")){
            mystery[guess1][guess2] = "!";
        }else{
            mystery[guess1][guess2] = "X";
        }
    }

    public String toString(){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(mystery[i][j].equals("*")){
                    mystery[i][j]="-";
                }
                System.out.print(mystery[i][j]+" ");
            }
            System.out.println("\n");
        }

        return "";

    }

    public static void main(String[] args) {
        MysteryBoard  mysteryBoard = new MysteryBoard();
        System.out.println("*** Original Mystery Board ***");
        System.out.println(mysteryBoard);

        mysteryBoard.setMystery();
        mysteryBoard.setMystery();
        mysteryBoard.setMystery();
        mysteryBoard.guess();
        mysteryBoard.guess();
        mysteryBoard.guess();
        mysteryBoard.guess();

        System.out.println("*** Mystery Board after Guess ***");
        System.out.println(mysteryBoard);



    }
}
```

### ArrayList

-   This class is part of the java.util package.
-   It works like an array, but it can dynamically increase or decrease the size. This is not the case with **ArrayList**
-   **Arraylist** does not have to declared to store a particular type.
-   Array list implements the **List** interface.

**Example**

```aidl
package com.learnJava.arraylist;

import java.util.ArrayList;

public class MusicBand {
    public static void main(String[] args) {

        ArrayList artists = new ArrayList(); //Creates an instance of the ArrayList

        artists.add("ABC"); //add method to add an element to the list.
        artists.add("XYZ");
        artists.add("GHI");

        System.out.println(artists);

        int location = artists.indexOf("ABC"); // returns the location of the artists.
        System.out.println("Location : " + location);

        System.out.println("Size of the artists : " + artists.size());
    }
}
```

#### Methods in ArrayList

-    Lets read page 334 in the book.


#### Specifying an Arraylist Element Type

```aidl
        List<String> stringList = new ArrayList<>(); //syntax 1

        ArrayList<String> stringList1 = new ArrayList<>(); //syntax 2

```
 
    
    