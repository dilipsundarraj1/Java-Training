
### Classes:

-   A class is a Template from which you can create objects.

Examples:  

-   BluePrint to houses


### Anatomy of a class:

 -  A class will have members or properties.
 
 ```aidl
    public class BaseketBallPlayer{
    
        /**
        * These are the properties
        **/
        private int jerseryNumber;
        private String playerName;
        private int pointsScored;
    }
    
```

 -  A class will have a constructor by default.
 
 **Default Constructor:**  
 
 -   By default any class will have the constructor with no Arguments.
 
 
 ```aidl
     public class BaseketBallPlayer{
     
     /**Default Constructor**/
     public BaseketBallPlayer(){
     
     }
     
         /**
         * These are the properties
         **/
         private int jerseryNumber;
         private String playerName;
         private int pointsScored;
         
     }
     
 ```
 
 **Constructor with Arguments or Parameters:**
 
 ```aidl
 
  public class BasketBallPlayer {
  
      /**
       * Properties
       */
      private int jerseryNumber;
      private String playerName;
      private int pointsScored;
  
  
      public BasketBallPlayer(){
  
      }
  
      /**
       * Constructor with Arguments
       * @param jerseryNum
       * @param playerNam
       * @param pointScored
       */
      public BasketBallPlayer(int jerseryNum, String playerNam, int pointScored) {
          jerseryNumber = jerseryNum;
          playerName = playerNam;
          pointsScored = pointScored;
      }
      
  
  }

```

#### Instance Data:

-   A constructor of the class gets invoked only when an object or instance is created.

-   How to create an Instance of a calss?

```aidl
 public static void main(String[] args) {

        BasketBallPlayer basketBallPlayer = new BasketBallPlayer(1,"Dilip", 5);
    }
```

-   The constructors will be invoked for the above call. Because we created an object using **new** operator.

-   The **basketBallPlayer** is the instance of the BasketBallPlayer.
-   The data it holds is the instance data.
    -   jerseryNumber
    -   playerName
    -   pointsScored

#### Encapsulation:

-   This is a concept of hiding the members of the class to the outside world.

#### Visibility Modifiers

-   public, private , default and protected


    
-   **private:**
    -   If a method or variable is marked as private (has the private access modifier assigned to it), then only code inside the same class can access the variable, or call the method.
    -   A class never be marked private.
    
```aidl
public class PrivateAccessModifier {

    private int age;
    private String name;
}

```
          
-   **default:**
    -   Any class or class member declaration without any Visibility Modifiers is the default.
    -   This class will be accessible only to other classes which are in the same package.

```aidl
package com.learnJava.accessModifiers;

class DefaultAccessModifier {

    int age;
    String name;
}

```

-   **protected**
    -   This is used only for variable and methods.
    -   This behaves the same as default, with the addition that subclasses can access protected methods and member variables (fields) of the superclass
    
-   **public:**
    -   This means any outside class can access this class and its members from outside.

#### Method:

-   Syntax for the method is below.

```aidl
<visibility modifier> <return-type> methodName(arguments...){
}

```

-   Sample code below.

```
 public void changeJerseyNumber(int jerseyNum){

        jerseryNumber = jerseyNum;
    }
    
```

-   How to Call a method and change the JerseyNum ?
 
 ```aidl
 BasketBallPlayer basketBallPlayer = new BasketBallPlayer(1,"Dilip", 5);
 basketBallPlayer.changeJerseyNumber(2);
```