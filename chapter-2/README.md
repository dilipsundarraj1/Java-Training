# Chapter -2

### Arithmetic Expressions:

-   An arithmetic expression is a combination of operator and operand.


#### What is a operator and a operand ?

```aidl
int total = 2 + 4;
```
 
- In the above example:
    -   operator - **+**
    -   operand - **2 , 4**
    
#### Common arithmetic operations:

-   Addition - **+**
-   Subtraction- **-**
-   Multiplication - **x**
-   Division - **/**
-   Remainder - **%**

#### Example :

- Addition
 
    ```aidl
    2+4 = 6
    ```
    
- Subtration
 
    ```aidl
    2-4 = -2
    ```

- Multiplication
 
    ```aidl
    2*4 = 8
    ```
    
- Division
 
    ```aidl
    4/2 = 2
    ```
    
- Remainder Operator
 
    ```aidl
    4%2 = 0
    ```
    
    ```aidl
    3%2 = 1
 
    ```

#### Float Arithmetic Operation:
-    Any arithmetic operations that involves floating value then the result will be a floating value.

- Examples:

```aidl

10.0/2 = 5.0
```

```aidl

10/2.0 = 5.0
```

```aidl

10.0/2.0 = 5.0
```

#### Integer Arithmetic Operation:


-   The result of the below operation is 2 instead of 2.5 because int cannot hold the decimal values.

```aidl
 10/4 = 2

```


### Operator Precedence:

-   Operators are combined to make more complicate expressions.

```aidl
14+8/2 = 18
```

-   In the above example ,the result 18 is achieved by the below order of execution.  
    -   First, the right side operation is performed
        ```
        8/2 = 4
        ```
    -   Second, the addition is performed
    
        ```aidl
        14+4 = 18 
        ```
 
 #### Precedence Rules:
 
 -  In Arithmetic operations multiplications, divisions and remainder operator are performed before addition and subtration.

 -  The order can be changed by adding paranthesis **()**.
 
 -  When paranthesis is present , then the  expression present inside the paranthesis gets executed first and the following
 
 Examples:  
 
```aidl
(14+8)/2 = 11
```

```aidl
 3 * (18  - 4)/2  = 21
 ```


### Data Conversion:

-   Data conversion is a process of converting one type to another.

```aidl

Type        default     size 

booelan     false       1 bit
byte        0           8 bits
char        \u0000      16 bits
short       0           16 bits
int         0           32 bits
long        0           64 bits
float       0.0         32 bits
double      0.0         64 bits
```
-   There are two types of conversion.
    -   Widening Conversion.
    -   Narrowing Conversion
    

#### Widening Conversion
-   This is a safest data conversion because they usually not lose information.

Example:  

- Assigning an int value to a double.

```
int total = 1 ;

double total2;

total2= total;

```

#### Narrowing Conversion
-   This is not the safest, becaue you might lose information and this should be avoided.

Example :  

-   Assigning a float value to an int value. 

```aidl
float  f1=2.5f;
int result1 = (int) f1;
```

#### Boolean:

-   A boolean value cannot be convereted to any other primitive data type.
-   So, boolean cannot be part of the data type conversion

Data conversion occurs in three ways:

-   assignment conversion
-   arithmetic conversion
-   casting

##### Assignment Conversion:

-   In the below example the dollars which is an int initially is converted to 12.0 after the assigment.
```aidl
 int dollars = 12; -> 12
double money = dollars;  -> 12.0
```

##### Arithmetic Conversion:

-   This kind of conversion happens while performing arithmetic operation.
```aidl
float sum = 4.0f;
int count=2;

float result = sum/count;
```

##### Casting
   
-   Provide the type within the paranthesis is called casting.
 
-   Syntax is  (<data type>)  

```aidl
float  f1=2.5f;
int result1 = (int) f1;
```

