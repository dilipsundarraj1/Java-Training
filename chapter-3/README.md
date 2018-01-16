# Chapter 2:

### Logical Operators

<table>

  <tr>
      <th>Operator</th>
      <th>Description</th>
      <th>Example</th>
      <th>Result</th>
  </tr>
  
  <tr>
    <td>!</td>
    <td>Logincal Not</td>
    <td>!a</td>
    <td>true is a false and false is a true</td>
  </tr>
  <tr>
      <td>&&</td>
      <td>Logincal AND</td>
      <td>a && b</td>
      <td>true if both a and b are true</td>
   </tr>
   <tr>
         <td>||</td>
         <td>Logincal OR</td>
         <td>a || b</td>
         <td>true if  a or b is true and false other wise</td>
    </tr>
    
    
</table>

#### Examples

<table>

<tr>
      <th>a</th>
      <th>b</th>
      <th>a && b</th>
      <th>a || b</th>
      
</tr>

<tr>
      <td>false</td>
      <td>false</td>
      <td>false</td>
      <td>false</td>
      
</tr>

<tr>
      <td>false</td>
      <td>true</td>
      <td>false</td>
      <td>true</td>
      
</tr>

<tr>
      <td>true</td>
      <td>false</td>
      <td>false</td>
      <td>true</td>
      
</tr>

<tr>
      <td>true</td>
      <td>true</td>
      <td>true</td>
      <td>true</td>
      
</tr>

</table>


### Comparing Strings and Characters

#### String

- How to compare Strings ?

    -   using the **equals** method.
    -   using the **==** operator.

```aidl
public class StirngComparison {

    public static void main(String[] args) {

        String str ="Java";
        String str2 ="Java";

        System.out.println(str.equals(str2)); -> true

        System.out.println(str==str2);-> true
    }
}
```

**EqualsIgnoreCase**


```aidl
public class StirngComparison {

    public static void main(String[] args) {

        String str ="Java";
        String str2 ="JAVA";

        System.out.println(str.equalsIgnoreCase(str2)); -> true

        System.out.println(str==str2); -> false
    }
}

```

### Comparing Characters

-   All the characters will have a unicode character, which will be used while comparing the characters.
-   Values of the unicode will be in the increasing order a - z anf A-Z.

```aidl
public class CharacterComparison {

    public static void main(String[] args) {

        char c ='c';
        char d ='d';
        char c1='c';

        System.out.println(c==d); -> false

        System.out.println(c==c1);-> true


        if(c>d){
            System.out.println("c is greater than d");
        }else{
            System.out.println("c is lesser than d");
        }



    }


```

### Comparing Float Values

```aidl
public class ComparingFloat {

    public static void main(String[] args) {

        float f1=2.4533f;
        float f2=2.4534f;

        System.out.println(f1==f2);

        System.out.println(f2-f1);
        
        System.out.println((Math.abs(f2-f1)< 0.1)); -> This is the best way of comparing float values
    }
}

```

### While Loop

Syntax:  

```aidl
while(<boolean-expression>){
    <while body>
}
```

-   The boolean expression should evaluate to true in order to execute the while loop.
-   The boolean expression should evaluate to false in order to exit the while loop.

```aidl
public class WhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag=true;

        while(flag){
            System.out.println("Please enter a number : ");
            int i = scanner.nextInt();
            if(i<0){
                flag=true;
            }else{
                flag=false;
            }

        }
        System.out.println("Exiting the Program");

    }
}
```

### Iterator

```aidl
public class URLDissector {

    public static void main(String[] args) throws FileNotFoundException {

        String url;
        Scanner fileScanner,urlScanner;

        fileScanner = new Scanner(new File("/Dilip/College-Assignments/Esha/codebase/Java-Training/chapter-3/src/com/learnJava/iterator/urls.inp"));

        while(fileScanner.hasNext()){ // true -> there are lines, false-> if it reaches the end of the line

            url = fileScanner.nextLine(); // fetches the next line

            System.out.println("URL" + url);

            urlScanner = new Scanner(url);
            urlScanner.useDelimiter("/"); // delimiter to split the values.

            while(urlScanner.hasNext()){ // true -> if there are elements.
                System.out.println(urlScanner.next());
            }
        }

    }
}

```