package datatypes;

/**
 * Created by z001qgd on 11/3/17.
 */
public class NonPrimitiveDataTypesPractice {

    public static void main(String[] args) {

        String s1 = "Dilip";
                    //01234

        System.out.println("Value of s1 : "+ s1+"****");

        System.out.println(s1.trim()+"****");

        System.out.println(s1.substring(0,2));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.replace('i','a'));
        s1 = s1.replace('i','a');
        System.out.println(s1);

        String s2 = s1;

        System.out.println("value of s2 is : " + s2);

        String s3 = new String("Dilip");

        System.out.println("Value of s3 : " + s3);

        System.out.println("length of the String " +  s3.length());

        System.out.println(s3.charAt(2));

        String s4 = "Car";
        String s5="Bike";
        String s6="bike";

        System.out.println(s4.equals(s5));

        System.out.println(s5.equalsIgnoreCase(s6));

        System.out.println(s5.contains("k"));

        System.out.println(s5.contains("a"));

        System.out.println(s5.toUpperCase());

        System.out.println(s5);

        String s7="car-bike-trailer";

        System.out.println(s7.split("-"));

        String[] strings = s7.split("-");

        //strings[0] = car
        //strings[1]= bike

        for(String str : strings){

            System.out.println("Split Value is : " + str);
        }

    }
}
