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
