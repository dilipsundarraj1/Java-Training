package datatypes;

/**
 * Created by z001qgd on 11/3/17.
 */
public class PrimitiveDataTypesPractice {

    public static void main(String[] args) {

        boolean flag=false;

        System.out.println("Old flag value is  : " + flag);

        flag = true;


        System.out.println("New flag  value is  : " + flag);

        char ch = 'c';

        System.out.println(" Value of charcter is : " + ch);

        ch = 'd';

        System.out.println(" New Value of charcter is : " + ch);

        int i = 2147483647;

        System.out.println(" Value of i is : " + i);

        i = 9;

        System.out.println(" New Value of i is : " + i);

        long l = 9223372036854775807l;

        System.out.println(" New Value of l is : " + l);

        float f = 1.255908990907099f;

        System.out.println(" New Value of f is : " + f);

        double d = 1.25590899090709d;

        System.out.println(" New Value of d is : " + d);

    }
}
