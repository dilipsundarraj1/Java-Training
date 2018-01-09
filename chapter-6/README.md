# Chapter 6 - Arrays

## Arrays
-   An array is simple but powerful way to group and organize data.
-   An array is a list of values. Each value is stores at a numbered position in the array.
-   The number for each position is called an **index** or **subscript**.


![](https://github.com/dsaish3/Java-Training/blob/master/images/java-arrays-1.png)


### How to Declare an array ?

-   In Java , Arrays are objects. To create an array, you must create a reference to the array.
-   Below creates an int array of 11 elements.
-   An array will store the element of same type. 
-   A value stores in an array is called **array element.** 
-   The type of values an array stores is called **element type**.
```aidl
 int[] height = new int[11];
 
 int -> type
 height -> reference variable
 int[11] -> We are asking Java to create an array to store 11 elements. It cannot be changed.
 
```
-   In the above example it cannot store double or float.



### How to fetch an element in an array ?

**Syntax**

```aidl
arrayReferenceVariable[index-number]
```

```
int[] height = new int[11];
```
-   The above example creates an array of 11 elements.

```aidl
 System.out.println(height[5]); -> This fetches the 6th element and prints its
```

### How to get the total length of an array?

-  **length** method will give your the total length of the array.

-   This **length** is different from the **length()** in String.

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

**BackWard Iteration **

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

            System.out.println( (char) (letter+'A'));
            System.out.println( ": " + upper[letter]);
            System.out.println( (char) (letter+'a'));
            System.out.println( ": " + upper[letter]);

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


![](https://github.com/dsaish3/Java-Training/blob/master/images/java-arrays-3.png)

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