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