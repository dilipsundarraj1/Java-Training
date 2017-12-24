
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

#### Anatomy of a Method:

-   Any method in Java will have the following.
    -   Access Modifier
    -   Return type or void
    -   Method name
    -   Parameters
    -   Method Body
    

##### Method Declaration:

-   A Method declation defines the code that needs to be executed when its invoked.

-   Syntax for the method is below.

```aidl
<visibility modifier> <return-type> methodName(parameters...){

    Method Body
}

```

Example:  

```
 public void changeJerseyNumber(int jerseyNum){

        jerseryNumber = jerseyNum;
    }
    
```

##### Method Invocation:

-   How to Call a method and change the JerseyNum ?
 
 ```aidl
 BasketBallPlayer basketBallPlayer = new BasketBallPlayer(1,"Dilip", 5);
 basketBallPlayer.changeJerseyNumber(2);
```

#### The Return Statement

-   This will be part of the method header.
-   This can be primitive(int, double) , String or any Object.

Code Examples:    

**return String:**
-   
```aidl
 public String getName() {
        return name;
    }

```

**return int:**

```aidl
 public int getId() {
        return id;
    }
```

**Void:**

-   When a method does not return anything then the return type holds void.
-   void is used mainly in the setter methods.
    
    
```aidl
public void setId(int id) {
        this.id = id;
    }
```
    
#### Parameters:

-   Parameters are categorized into two categories.
    -   Formal parameters.
        -   The parameters in the header of method decalration.
        
            ```aidl
            public void setId(int id) { -> These are called formal parameters
                    this.id = id;
                }
            
            ```
    -   Actual parameters.
        -   The values passed to the  method are called Actual Parameters.
        
            ```aidl
            Employee employee = new Employee(1, "Dilip");
            employee.setId(3);
    
             ```
 