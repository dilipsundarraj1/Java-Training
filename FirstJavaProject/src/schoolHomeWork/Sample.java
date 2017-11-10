package schoolHomeWork;

/**
 * Created by z001qgd on 11/9/17.
 */
public class Sample {

    public static void main(String[] args) {

        boolean a = false;
        boolean b = true;

        System.out.println(!(a && b ));

        System.out.println( ((!a) && (!b)));
        System.out.println(((!a) || (!b)));
        System.out.println(!(a || b));
        System.out.println((a || b));
        System.out.println((a || b) && (a&&b));

        System.out.println("2nd one ");

       // System.out.println(!(a &&b ) && (a || b));
        System.out.println("OR Operations :");
        System.out.println(true ||  false);
        System.out.println(false ||  true);
        System.out.println(true ||  true);
        System.out.println(false ||  false);

        System.out.println("AND Operations :");
        System.out.println(true &&  false);
        System.out.println(false &&  true);
        System.out.println(true &&  true);
        System.out.println(false &&  false);

        int x=0;
        boolean y = true;

        //3 rd question
        if( y && (x!=0) && (2/x==0)){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }

        //4th question

        int z=3;
        boolean result;

        result = (z%2 ==0);
        System.out.println("option 1 : " + result);

        if (z%2==0){
            result=true;
        }else{
            result=false;
        }
        System.out.println("Option 2 : " + result);

        if((z * 2)/2 == z){
            result = true;
        }else{
            result=false;
        }

        System.out.println("Option 3 : " + result);

    }
}
