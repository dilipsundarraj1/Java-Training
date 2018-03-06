# Chapter 7

## Overriding Methods

-   When a child class defines a method with the same name and signature as a method in the parent class, we say that child's version overrides the parent's version in favor of its own.

**Thought**

```aidl
package com.learnJava.overriding;

public class Thought {

    public void message(){

        System.out.println("Message inside Thought Class");
    }
}

```

**Advice**

```aidl
package com.learnJava.overriding;

public class Advice extends  Thought {

    public void message(){ // overrides and implements its own behavior.

        System.out.println("Message inside Advice Class");
    }


}
```

**Messages**
```aidl
package com.learnJava.overriding;

public class Messages {


    public static void main(String[] args) {

        Thought thought = new Thought();

        Advice advice = new Advice();

        thought.message();
        advice.message();
    }
}

```

## Class Hierarchies

-   A child class can be the parent of its own child class.
-   Many classes can be created from a Single Parent. 
-   We call the **family tree** of classes a **class hierarchy**.
-   Two children of the same parent are called siblings.

![](https://github.com/dsaish3/Java-Training/blob/master/chapter-7/images/class-hierarchy.gliffy.png)

**Car**



```aidl
package com.learnJava.classhierarchy;

public class Car {

    private int year;
    private String owner;
    private int noOfWheels;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", owner='" + owner + '\'' +
                ", noOfWheels=" + noOfWheels +
                '}';
    }

    public void drive(){
        System.out.println("inside Car drive method");
    }
}
```

**Toyota**

-   This is a child of Car.
-   This the first level in the Car hierarchy.

```aidl
package com.learnJava.classhierarchy;

public class Toyota extends  Car {

    private String gearStyle;

    public String getGearStyle() {
        return gearStyle;
    }

    public void setGearStyle(String gearStyle) {
        this.gearStyle = gearStyle;
    }

    public void drive(){
        System.out.println("inside Camry drive method");
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "gearStyle='" + gearStyle + '\'' +
                '}';
    }
}

```

**Camry**

-   This is a child of Toyota.
-   This the second level in the Car hierarchy.

```aidl
package com.learnJava.classhierarchy;

public class Camry extends Toyota {

    public void drive(){
        System.out.println("inside Camry drive method");
    }


}
```

## The Object Class

-   In Java all classes are created from the Object class.
-   All the classes that we create in Java extend Object class.

### Object's Methods

-   String toString()
-   int hashCode
-   boolean equals(Object obj)

```aidl
public class Example extends  Object { // by default all the classes extends Object class. 
}
```

**Student**

```aidl
package com.learnJava.object;

public class Student {

    private String name;
    private int numOfCourses;

    public Student(String name, int numOfCourses) {
        this.name = name;
        this.numOfCourses = numOfCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numOfCourses=" + numOfCourses +
                '}';
    }
}

```
**StudentAthelete**

```aidl
package com.learnJava.object;

public class StudentAthelete extends Student{

    private String sport;

    public StudentAthelete(String name, int numOfCourses,String sportName) {
        super(name, numOfCourses);
        sport = sportName;
    }

    @Override
    public String toString() {
        return "StudentAthelete{" +
                "sport='" + sport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        StudentAthelete that = (StudentAthelete) o;

         if(sport.equals(that.sport))
             return true;
         else
             return  false;
    }

    @Override
    public int hashCode() {
        return sport != null ? sport.hashCode() : 0;
    }
}

```

**Academic**

```aidl
package com.learnJava.object;

public class Academic {

    public static void main(String[] args) {

        Student frank = new Student("Frank", 5);

        StudentAthelete adam = new StudentAthelete("Adam", 5,"soccer");

        StudentAthelete adam2 = new StudentAthelete("Adam", 5,"soccer");

        System.out.println(frank); // calls the overriden toString() Method.

        System.out.println(adam); // calls the overriden toString() Method.

        if(!frank.equals(adam)){ //calls the overriden equals Method.
            System.out.println("These are two different students");
        }

        if(adam2.equals(adam)){ // overriden the equals method from Object class
            System.out.println("These are same students");
        }
        System.out.println(frank.hashCode()); // Random number generated by Object class.
        System.out.println(adam.hashCode()); // Random number generated by Object class.


    }
}

```

## Abstract Classes

-   An abstract class cannot ever be instantiated.
-   A class that has the **abstract** keyword is a abstract class.
-   An abstract class defines the common behavior so that it can be inherited. The sub class will inherit the by extending the abstract class.
-   An abstract can also just define abstract methods so that the child classes can implement on its own.

```aidl
package com.learnJava.abstractt;

public abstract class Vehicle {

    public String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int speed;


    public abstract int calculateMileage(int speed);
}

```