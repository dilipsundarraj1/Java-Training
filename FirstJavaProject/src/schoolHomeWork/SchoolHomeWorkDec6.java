package schoolHomeWork;

/**
 * Created by z001qgd on 12/6/17.
 */
public class SchoolHomeWorkDec6 {

    private String name ="dilip";

    public void method1(int i){ //method header
        System.out.println("Inside method1");
    }

    public void method2(int i){
        System.out.println("Inside method1");
    }

    public int cube(int x){
        for(int i=0;i<3;i++){
            x*=x; // x = x*x

        }
        return x;
    }

    public void method1(int i,int j){
        System.out.println("Inside method1");
    }


    public static void main(String[] args) {
        SchoolHomeWorkDec6 schoolHomeWorkDec6 = new SchoolHomeWorkDec6();
        SchoolHomeWorkDec6 schoolHomeWorkDec61 = new SchoolHomeWorkDec6();
        SchoolHomeWorkDec6 schoolHomeWorkDec62 = new SchoolHomeWorkDec6();
        schoolHomeWorkDec62.method1(1); //method call
        System.out.println(schoolHomeWorkDec6.cube(2));
    }
}
