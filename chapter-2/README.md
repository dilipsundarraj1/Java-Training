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


