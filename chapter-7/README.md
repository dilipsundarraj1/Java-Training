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