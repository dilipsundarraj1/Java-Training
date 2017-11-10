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
    }
}
