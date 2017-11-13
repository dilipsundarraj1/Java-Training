package schoolHomeWork;

/**
 * Created by z001qgd on 11/9/17.
 */
public class Sample1 {

    public static void main(String[] args) {

        int x=0;

       /* if(x>0)
            x++;
        else
            x--;
        System.out.println("1 :" + x);*/

        if(x>0)
            x++;
        else if (x<0)
            x--;

        System.out.println("2 :" + x);

       /* if(x>0)
            x++;
        if (x<0)
            x--;
        else
            x=0;

        System.out.println("3 :" + x);*/

       /* if(x==0)x=0;
        else x++;
        x--;
        System.out.println("4 :" + x);
*/
       /* System.out.println("5: " +x++);
        System.out.println("5: " +x--);*/

        System.out.println('a' == 'A');

        System.out.println(true || false || false);
        int a=1;  int b=-1;  x=0;
        if(a>0)
            if(b<0)
                x=x+5;
            else
                if(a>5)
                    x=x+4;
                else
                    x=x+3;

        else
            x=x+2;

        System.out.println("X value is : " + x);
          x=0;
        for (int i=0; i<5;i++)
            x+=i;
        System.out.println("Final Value of x is : " + x);

        x=10;
        while (x > 0){
            System.out.println(x);
            x--;
        }
        x=0;
        for(int j=0;j<100;j++)
            for(int k=100;k>0;k--)
                x++;
        System.out.println("Executed time s" + x);

        String s1="Dilip";
        String s2="Dilip";
        System.out.println(s1.length() == s2.length());
        System.out.println(s1.equals(s2));

        for(int j=s1.length();j>0;j--){
            System.out.println(s1.charAt(j-1));
        }
        int i=0;
       /* for(int j=0;j<1000;)
            System.out.println("inside for loop");
            i++;*/
        int count=0;
        for(int j=0;j<10;j++)
            for(int k=10;k>j;k--){
                System.out.println("*");
                count=count+1;
            }

        System.out.println("count : "+ count);

    }
}
