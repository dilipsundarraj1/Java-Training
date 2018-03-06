package com.learnJava.object;

public class StudentAthelete extends Student{

    private String sport;

    public StudentAthelete(String name, int numOfCourses,String sportName) {
        super(name, numOfCourses);
        sport = sportName;
    }

    @Override
    public String toString() {
        return "StudentAthelete{" +
                "sport='" + sport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        StudentAthelete that = (StudentAthelete) o;

         if(sport.equals(that.sport))
             return true;
         else
             return  false;
    }

    @Override
    public int hashCode() {
        return sport != null ? sport.hashCode() : 0;
    }
}
