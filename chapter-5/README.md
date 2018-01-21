# Chapter 5



### The NULL Reference

**Reference Variable**

-   A variable which references to an object or instance is called a reference variable.

**Example:**
```aidl
public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {


        Car car1 = new Car("Camry", 2017); //car1 is a reference variable
        Car car2 = new Car("Camry", 2017);////car2 is a reference variable
        String trainNumber = "Scooby"; //trainNumber is a reference variable.
        int i =1; //i is not a reference variable.
    }
}

```

-   A reference variable that does not point to an object is called a **null Reference**.

-   In the below example the trainNumber is a reference variable , it does not refer to any object.

```aidl
public class NameIsNull {

    public static void main(String[] args) {

        String trainNumber;//not initialized ,therefore null

    }
}
```

- **null** is a reserved key word , you cannot use null as a variable trainNumber.

Example:   

```aidl
String null = "dilip"; // invalid , this gives you compilation issue.
```


#### How to perform NULL check ?

-   Use the **==** operator to check whether the reference variable is null.

```aidl
public class NameIsNull {

    public static void main(String[] args) {

        String trainNumber=null;//not initialized ,therefore null

        if(trainNumber ==null)
            System.out.println("Invalid Name");
        else
            System.out.println("Valid Name and the length is : " + trainNumber.length());
    }
}
```

#### How to perform Not NULL check ?
-    Use the **!=** operator to perform not null check.

```aidl
public class CarIsNotNull {

    private String model;
    private int year;

    public CarIsNotNull(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {

        CarIsNotNull car1 = new CarIsNotNull("Camry", 2017);

        if(car1!=null){
            System.out.println("Car is not null");
        }else if(car1==null){
            System.out.println("Car is null");
        }
    }


}
```

### The this Reference

-   **this** is a reserved keyword in Java
-   This lets an object to refer itseld.
-   As we know any method is invoked through a object. Inside that method this can be reffered to a current existing object.

```aidl
public class Truck {

    private String driverName;
    private String truckOwnwer;

    public Truck(String driverName, String truckOwnwer) {
        this.driverName = driverName;
        this.truckOwnwer = truckOwnwer;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTruckOwnwer() {
        return truckOwnwer;
    }

    public void setTruckOwnwer(String truckOwnwer) {
        this.truckOwnwer = truckOwnwer;
    }

    public void printDriverName(){
        System.out.println(this.driverName);
        System.out.println(this.truckOwnwer);
    }

    public static void main(String[] args) {

        Truck truck2 = new Truck("Dilip", "XYZ");
      //  System.out.println(truck.getDriverName());
        truck2.printDriverName();

        Truck truck1 = new Truck("Scooby", "ABC");
      //  System.out.println(truck1.getDriverName());
        truck1.printDriverName();

    }
}

```

### Aliases

-   Java has its own memory and all the objects gets created stored in the location.

#### Where does the actual object gets stored ?


```aidl
    Integer i1 = new Integer(1);  // i1 refers to a reference variable address, not the value 1.
    Integer i2 = new Integer(1);  // i2 refers to a reference variable address, not the value 1.

    System.out.println(i1==i2); //false, == refer to the variable address.They both refer to different reference variable address.
    System.out.println(i1.equals(i2));//true, equals method compares the vaule of the object which is 1 and not the addess.

```

#### How to check two objects Aliases to each other?
-   This is done by using **==** operator.
-   Two objects are aliases to each other only the **==** operation returns true.

```aidl

 Integer i1 = new Integer(1);   // i1 refers to a reference variable address, not the value 1.
 Integer i3 = i2; // now i1 and i3 points to the same location.
 System.out.println(i3==i2); // true,  because both are referring to the same address.


```

#### Comparing Objects:
- We have to really careful when comparing Objects/Instances.
-   **==** just compared the address of the variable.
-   **equals** method compares the actual value of the object. **equals** method is part of the Object class.

```aidl
public class Num {

    private int number;

    public Num(int number) {
        this.number = number;
    }

    public static void main(String[] args) {

        Num number = new Num(1); // number is a reference variable and it holds the address of the object.
        System.out.println(number);
```

-   In the below example, i1 and i2 just stores the reference variable address.

    ```aidl
    Integer i1 = new Integer(1);  // i1 refers to a reference variable address, not the value 1.
    Integer i2 = new Integer(1);  // i2 refers to a reference variable address, not the value 1.

    ```

```aidl

public class Aliases {

    public static void main(String[] args) {

        int a1=1;
        int a2=1;

        System.out.println(a1==a2);

      Integer i1 = new Integer(1);  // i1 refers to a reference variable address, not the value 1.
      Integer i2 = new Integer(1);  // i2 refers to a reference variable address, not the value 1.

        System.out.println(i1==i2); //false, == refer to the variable address.They both refer to different reference variable address.
        System.out.println(i1.equals(i2));//true, equals method compares the vaule not the addess.

        Integer i3 = i2; // now I3 and I2 refers to the same address. Here just the address gets copied.

        System.out.println(i3==i2); // true,  because both are referring to the same address.




    }
}

```

#### String Comparison

-   String is an exception when it comes to compares different objects of same value.

```aidl
 String name1 ="Dilip";
 String name2 ="Dilip";
 System.out.println(name1==name2); //true
 System.out.println(name1.equals(name2)); //true

```


### Passing Objects

-   Java passes all parameters to a method by value.
-   When a object is passed to a method it passes the reference variable , any change to the reference will actually change the value.

```aidl

public class Num {

    private int value;


    public Num(int num) {
        value = num;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Num{" +
                "value=" + value +
                '}';
    }
}
```

```aidl
public class ParameterChanger {

    public void changeValues(int f1, Num f2, Num f3){

        f1 = 999;
        f2.setValue(888);
        f3 = new Num(777);
    }
}

```


```aidl
public class ParameterPassing {

    public static void main(String[] args) {
        int a1 =1;
        Num a2 = new Num(2);
        Num a3 = new Num(3);

        ParameterChanger parameterTester = new ParameterChanger();

        parameterTester.changeValues(1, a2, a3);

        System.out.println( "a1 : " + a1);
        System.out.println( "a2 : " + a2.getValue());
        System.out.println( "a3 : " + a3.getValue());
    }
}

```

### The Static Modifier

-   static is a reserverd keyword that you use it to name a variable varibale or method with static.
-   **static** can be used with method or variables.
    -   static variable
    -   static method
-   A static method or variable should always be accessed using the className not using the object/instance reference variable.
-   A **Constructor** cannot have a **static** keyword.
    -   This will give compilation issue.

```aidl
public class Train {

    private int trainNumber; // instance variable


    public static Train(){ // this is not allowed. Compilation issue

    }
```


**static variable:**
-   A variable that has a static keyword is called **static** variable or **class** variable.

 **Syntax to invoke a static Variable:**

```aidl
ClassName.variableName;

```

```aidl
public class Train {

    private int trainNumber; // instance variable
    private static int count=0; // static variable

    public Train(int name) {
        this.trainNumber = name;
    }

    public static void main(String[] args) {

        Train train1 = new Train(10);
        train1.count = 1; // Wrong
        Train.count =1; // Right


        Train train2 = new Train(11);
        train2.count = 2; // Wrong
        Train.count =2; // Right
    }
}

```

**static methods:**

-   A static method will have the static keyword as part of the method declaration.
-   A static method cannot reference to a instance vaiable.

 **Syntax to invoke a static method:**

```aidl
Classname.staticMethod;

```

**Example:**
```aidl
public static int changeTrainInstanceCount(){ //static method

        return count++;
    }

```

```aidl
public class Train {

    private int trainNumber; // instance variable
    private static int count=0; // static variable

    public Train(int name) {
        this.trainNumber = name;
    }

    public static int changeTrainInstanceCount(){ //static method

        return count++;
    }

    public static void main(String[] args) {

        Train train1 = new Train(10);
        Train.count =1; // Right


        Train train2 = new Train(11);
        Train.count =2; // Right
    }
}

```

-   A compiler will issue if a static method try to access a non-static/instance variable.

```aidl

 public static int changeTrainInstanceCount(){ //static method
        trainNumber = 3;//compilation issue
        return count++;
    }

```

#### Constants:

-   Constants are mainly declared using the final modifier.
-   You will have **final** and **static** keyword together.

```aidl
    private static final int HEADS=0;
    private static final int TAILS=0;
```

### Exceptions:

When exception occurs in java then this will crash the program.

-   An **exception** is an object that defines a problem that can be fixed.
-   An **error** is like an exception except it cannot be fixed.

```aidl
public class ExceptionCheck {

    public static void main(String[] args) {

        //String s1 = "DIlip";
        String s1 = null;
        System.out.println(s1.length());//Null Pointer Exception and crashes the program and abrupts the execution of the program.

        String s2 = "Scooby";
        System.out.println(s2.length());//Wont get executed

        String s3 = "Esha";
        System.out.println(s3.length());//Wont get executed

    }
}
```

#### Exception Messages:
-   If the program does not handle exception then it will crash the program and describes the exception where it happened.

**stack trace:**
-   The first line of the output tells us which exception was thrown.
-   The rest of the output is called **stacktrace**.

```aidl
Exception in thread "main" java.lang.NullPointerException
	at com.learnJava.exception.ExceptionCheck.main(ExceptionCheck.java:12)
```

#### Commmon Exceptions

-   NullPointer Exception

```aidl
        String s1 = null;
        System.out.println(s1.length()); // Null Pointer Exception
```
-   ArithmeticException

-   If you try to divide a number by 0 , then it will throw number format exception.
```aidl
public class NumberException {

    public static void main(String[] args) {

        divide(10,0);
    }

    public static  void divide(int a, int b){

        System.out.println(a/b); //ArithmeticException

    }
}
```

-   ArrayIndexOutofBounds Exception
-   ClassCastException

#### Throwing Exceptions

-   Until now we have seen Java throwing exceptions.
-   We can throw exceptions too.

```aidl
public class ThrowException {

    public static void main(String[] args) {

        throw new IllegalArgumentException("just testing");
    }
}

```

### Interfaces:

-   An interface is a collection of constants and abstract methods.
-   You cannot create an object of an interface.

**abstract methods**
-   An abstract method is a method that does not have an implementation.
-   An abstract method will have the abstract keyword associated with it.

```aidl
public abstract void setComplexity(int complexity);
```

**Interface Syntax**

<visibiltity modififier> interface <interfacename>{

        public void setName(); // Just the declaration.
}

**Example**

-   You don't have to provide the abstract keyword because all the methods are abstract by default.

```aidl
public interface Complexity {

    public void setComplexity(int complexity); // method declaration.
    int getComplexity();// method declaration.
}
```

### Class Implements interface

-  An Interface just have the declaration.

-  Someone needs to use it. That someone is nothing but the class.

-   Class uses the **implements** keyword to implement the Interface.

```aidl
public class Question implements  Complexity {
    @Override
    public void setComplexity(int complexity) {

    }

    @Override
    public int getComplexity() {
        return 0;
    }
}

```

**Example**

```aidl
public interface Complexity {

    public  void setComplexity(int level);
    int getComplexity();
}

```

```aidl
public class Question implements  Complexity {


    private String question, answer;
    private int complexity;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public void setComplexity(int level) {

     complexity = level;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public int getComplexity() {
        return complexity;
    }


}
```

```aidl
public class MiniQuiz  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String possbile;
        Question q1 = new Question("What is the capital of Minnesota ? ","Saint Paul");
        q1.setComplexity(1);


        Question q2 = new Question("What is the capital of India ? ","New  Delhi");
        q1.setComplexity(10);

        System.out.println(q1.getQuestion());
        System.out.println("Complexity Level : " + q1.getComplexity());
        possbile = scanner.nextLine();

        if(q1.getAnswer().equals(possbile))
            System.out.println("correct");
        else
            System.out.println("No, The answer is "+ q1.getAnswer());


        System.out.println(q2.getQuestion());
        System.out.println("Complexity Level : " + q2.getComplexity());
        possbile = scanner.nextLine();

        if(q1.getAnswer().equals(possbile))
            System.out.println("correct");
        else
            System.out.println("No, The answer is "+ q2.getAnswer());


    }
}

```


#### Class with Multiple Interface Example

-   We can have a class implements multiple Interface.


**Interface 1**

```aidl
public interface Simplicity {

    public void simple();
}
```

**Interface 2**

```aidl
public interface Complexity {

    void setComplexity(int level);
        int getComplexity();
}
```

**Class with Multiple Interfaces**

```aidl
public class Multiple implements Complexity, Simplicity {
    @Override
    public void setComplexity(int level) {

    }

    @Override
    public int getComplexity() {
        return 0;
    }

    @Override
    public void simple() {

    }
}
```

### Comparable Interface

-   The comparable interface has one method called **compareto**.
-   Any class that implements this comparable interface have to implement this method.
-   The **compareTo** method accepts a parameter which is a object.

```aidl
 public int compareTo(T o);
```

**Example**

```aidl
public class Num implements Comparable {

    private int value;

    public Num(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {

        Num num = (Num) o ; // Class Cast from Object to Num class.
        int otherValue = num.getValue();

        if(value < otherValue)
            return -1;
        else if (value > otherValue)
            return 1;
        else
            return 0;
    }

}
```

**Driver Class**

-   This driver class compares two objects.

```aidl
public class NumDriver {

    public static void main(String[] args) {

        int i1 = 1;
        int i2 =2;

        if(i1 < i2)
            System.out.println(-1);
        else if(i1 >i2)
            System.out.println(1);
        else
            System.out.println(0);

        Num num1 = new Num(1);
        Num num2 = new Num(2);

        System.out.println(num1.compareTo(num2));
    }
}
```

**toString()**

-   Lets print the num1Object from above.

```aidl
System.out.println(num1);
```
```
com.learnJava.comparable.Num@60e53b93
```
-   In order to print the actual value of the object.

-   **toString:** This method is part of the Object class itself.
```
    public String toString() {
        return "Num{" +
                "value=" + value +
                '}';
    }
```
-   
### List Interface

-   This interface is implemented by classes that represents an order collections of elements.
-   The methods of List Interface is:
    -   Iterator iterator()
        -   returns a list iterator of the elements in the list.
    -   ListIterator listIterator()
        -   returns a list iterator of the elements in the list.
    -   size
        -   Returns the number of elements in the list
    -   void add()
        -   Adds the specified element in the list.

### Iterator Interface
-   From the name it suggests that you can iterate using the iterator calls and this returns an object. This process is called Iteration.
-   Some of the methods of the Iterator interface.
    -   boolean hasNext()
        -   Returns true if the executing object contains one or more objects that have not been returned by the **next** method.
    -   Object next()
        -   Returns a reference to the next object in the Iterator.
    -   void remove()
        -   Removes the item most recently returned by the next method from the underlying collection.

### ListIterator Interface
-   This interface contains some of the methods from the Iterator plus a few more including add and set.

    -   boolean hasNext()
        -   Returns true if the executing object contains one or more objects that have not been returned by the next method.
    -   Object next()
        -   Returns a reference to the next object in the iterator.
    -   void remove()
        -   Removes the item most recently retirned by the next method from the underlying collection.
    -   void add(Object obj)
        -   Inserts the element obj to the list immediately after the last element that was returned by the next method.
    -   void set(Object obj)       
        -   Replaces the last element returned by next with the element obj.


 ### Nested classes:

 -   A class that is written inside another class is called Nested class.
 -  The class that encloses the class is called the Enclosing class.
 -  In the below example the **Student** class is a member of the **School** class. It is like any method or variable inside a class.

 ```
 public class School {

     private String name;

     class Student {

     }

 }
 ```

 -  In the above example:
    -   School - enclosing class
    -   Student -   nested class or inner class.

 -  The **static** keyword  can be applied to class but only if the class is nested inside another.

```
 public class School {

     private String name;

     static class Student {
         String studentName;

     }

 }
```
