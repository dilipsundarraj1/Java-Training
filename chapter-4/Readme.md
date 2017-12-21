
### Classes:

-   A class is a Template from which you can create objects.

Examples:  

-   BluePrint to houses


### Anatomy of a class:

 -  A class will have properties.
 
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

