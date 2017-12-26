package com.learnJava.association;

/**
 * Created by z001qgd on 12/26/17.
 */
public class Student {

    private String firstName;
    private String lastName;
    private String id;
    private SchoolAddress schoolAddress;
    private HomeAddress homeAddress;

    public Student(String firstName, String lastName, String id, SchoolAddress schoolAddress, HomeAddress homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.schoolAddress = schoolAddress;
        this.homeAddress = homeAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SchoolAddress getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(SchoolAddress schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", schoolAddress=" + schoolAddress +
                ", homeAddress=" + homeAddress +
                '}';
    }


    public static void main(String[] args) {

        SchoolAddress schoolAddress = new SchoolAddress("1234 Street1","AppleValley","MN", "55222");
        HomeAddress homeAddress = new HomeAddress("1234 Street3","Eagan","MN", "55111");

        Student student = new Student("XYZ","ABC", "123", schoolAddress, homeAddress);

    }
}
