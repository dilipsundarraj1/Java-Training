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


        String name1 ="Dilip";
        String name2 ="Dilip";
        System.out.println(name1==name2);


    }
}

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

-   static is a reserverd keyword you cannot use it to name a variable varibale or method with static.
-   **static** can be used with method or variables.
    -   static variable
    -   static method
-   A static method or variable should always be accessed using the className not using the object/instance reference variable.
    
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

-   A compiler will issue if a static method try to access a non static variable.

```aidl

 public static int changeTrainInstanceCount(){ //static method
        trainNumber = 3;//compilation issue
        return count++;
    }

```