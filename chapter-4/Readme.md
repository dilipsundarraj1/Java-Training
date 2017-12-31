
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
-   Instance data is accessible throughout the class.

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
    -   Parameters/Parameter List
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

-   In general parameters are referred to the values passed to the method.

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
            employee.setId(3); -> 3 is the actual parameter

             ```
#### Local Data:

-   A variable declared inside a method is referred as local Data.


```aidl
public class TV {

    private String type;
    private int tvSize;

    public TV(String type, int tvSize) {
        this.type = type;
        this.tvSize = tvSize;
    }

    public void start(){

        int channel =0; //- > This is a local data.
    }


}

```

-   A local data is something which is not accesible outside the method.

##### Local Data vs Instance Data:
-   Local data is visible only to the method. Meaning you cannot refer to the data outside the method.
-   Instance data is visible throughout the class.


#### Accessors and Mutators:

**Accessor:**
    -   Accessor method provides read only access to a particular value.
    -   Accessor method names always starts with **getX()**

    ```
     public String getType() {
            return type;
        }
    ```
 **Mutator**
    -   A mutator method is otherwise called as modifier method.
    -   Mutator names have the form **setX**

    ```
    public void setType(String type) {
            this.type = type;
        }

    ```

 ### Method Overloading:

 -  In Java you can use the same method with different parameter lists for several methods.This is called method Overloading.

 #### Method Signature:
 -  The method name along with the type and order of its parameters are called Methods signature.

 Sample code for Method overloading:  

 -  In the below examopke

 ```aidl
public class TV {

    private String type;
    private int tvSize;

    public TV(String type, int tvSize) {
        this.type = type;
        this.tvSize = tvSize;
    }

    public void start(){

        int channel =0;
    }

    public void start(String samsungTV){

        int channel =0;
    }

    public void start(int  times){

        int channel =0;
    }
    }
```

##### Constructor Overloading:

-    Below is the sample for constructor overloading.

```aidl
public class Car {

    private String owner;
    private  int year;
    private String model;

    private Car(){

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String owner) {
        this.owner = owner;
    }
}
```

### Method Decomposition:

-   This is the concept of decomposing a method in to multiple methods.


#### Object RelationShips:

-   Two classes have a Association if they are aware of each other.

Example code:

  -   Below is a Student Class.

```aidl
public class Student {

    private String firstName;
    private String lastName;
    private String id;
    private SchoolAddress schoolAddress;
    private HomeAddress homeAddress;

    public Student(String firstName, String lastName, String id, SchoolAddress schoolAddress, HomeAddress homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.schoolAddress = schoolAddress;
        this.homeAddress = homeAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SchoolAddress getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(SchoolAddress schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", schoolAddress=" + schoolAddress +
                ", homeAddress=" + homeAddress +
                '}';
    }


    public static void main(String[] args) {

        SchoolAddress schoolAddress = new SchoolAddress("1234 Street1","AppleValley","MN", "55222");
        HomeAddress homeAddress = new HomeAddress("1234 Street3","Eagan","MN", "55111");

        Student student = new Student("XYZ","ABC", "123", schoolAddress, homeAddress);

    }
}
```

**SchoolAddress:**

```aidl
public class SchoolAddress {

    private String addressLine;
    private String city;
    private String state;
    private String zipCode;

    public SchoolAddress(String addressLine, String city, String state, String zipCode) {
            this.addressLine = addressLine;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "SchoolAddress{" +
                "addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

```


**HomeAddress:**

```aidl
package com.learnJava.association;

public class HomeAddress {
    private String addressLine;
    private String city;
    private String state;
    private String zipCode;

   public HomeAddress(String addressLine, String city, String state, String zipCode) {
           this.addressLine = addressLine;
           this.city = city;
           this.state = state;
           this.zipCode = zipCode;
       }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

     @Override
        public String toString() {
            return "HomeAddress{" +
                    "addressLine='" + addressLine + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zipCode='" + zipCode + '\'' +
                    '}';
        }
}

```

-   Student has two relationships.
    -   SchoolAddress
    -   HomeAddress
-   We can say that Student **has a** relationship to  SchoolAddress.
-   We can say that Student **has a** relationship to  HomeAddress.

#### How to iterate each character in a String ?

- The way to do it using the for loop.
- Follow the below steps to perform that operation.
  - Determine the length of the String.
  - Build the for loop which takes in the strings length.
  - use the charAt(<int>) of String to fetch each character in the String.
  - Print each character in the String.

```
void iterateEachCharacter(){

       String name = "Dilip";

       for(int i=0;i<name.length();i++) {

           char c = name.charAt(i);

           System.out.println(c);
       }
   }
```

#### How to calculate the similar characters in  a String ?

```
public class StringCharacterIterate {

    public static void main(String[] args) {

        String name = "Dilip";

        int count = 0;
        System.out.println("Length of the String : "  + name.length());

        for(int i=0;i<name.length();i++){

            char c = name.charAt(i);

            if(c == 'i'){
                count = count +1 ;
            }
        }

        System.out.println("The total number of i's are : " + count);
    }
}
```


### New Line Character:

- This character is mainly used to print the values in a new line.

- The character is **\n**.

```
public class NewLineCharacter {

    public static void main(String[] args) {

        System.out.println("Hello World \n How Are you ?");
    }
}

```
