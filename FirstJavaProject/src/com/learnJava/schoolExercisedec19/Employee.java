package com.learnJava.schoolExercisedec19;

/**
 * Created by z001qgd on 12/19/17.
 */
public class Employee {

    private String name;
    private int socialSecurityNum;
    private String position;
    private double hourlyWages;

    public Employee(String name, int socialSecurityNum, String position,double hourlyWages){

        this.name=  name;
        this.socialSecurityNum=socialSecurityNum;
        this.position= position;
        this.hourlyWages= hourlyWages;

    }

    public double pay(int nooFhoursWorked){//formal parameter

        int overTimeHours;
        double overTimeWages=0.0;
        if(nooFhoursWorked > 40){
            overTimeHours = nooFhoursWorked-40;
             overTimeWages = overTimeHours*10*1.5;
        }

        double regularWages = 40*10;

        return regularWages + overTimeWages;

    }

    public void raise(double newWage){

        if(newWage < this.hourlyWages){
            System.out.println(" You have passed a wage which is less than the previous wage. Please pass a value greater than the current wage.");
        }else{
            this.hourlyWages = newWage;
        }

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", socialSecurityNum=" + socialSecurityNum +
                ", position='" + position + '\'' +
                ", hourlyWages=" + hourlyWages +
                '}';
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Esha", 123,"Student" , 10);

        System.out.println(employee.pay(50)); //actual parameter

        System.out.println("Before wage change  :" + employee);

        employee.raise(9.0);

        System.out.println("After wage change  :" + employee);


    }
}
