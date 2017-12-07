package schoolHomeWork;

/**
 * Created by z001qgd on 12/6/17.
 */
public class Swapper {

    private int x;
    private String y;
    private int z;

    public  Swapper(int a , String b, int c){
        x=a;
        y=b;
        z=c;
        swap();
    }

    public String swap() {

        int temp = x;
        x=z;
        z=temp;

        return y;
    }

    public String toString(){

        if(x<z)
            return y;
        else
            return ""+x+z;
    }

    public static void main(String[] args) {

        /*Swapper s = new Swapper(6, "LNHS", 4);
        System.out.println(s.toString());;

        Swapper s2 = new Swapper(0, "LNHS", 8);
        System.out.println(s2.toString());*/

        Swapper s3 = new Swapper(9, "no", 3);
        System.out.println(s3.swap());
    }
}
