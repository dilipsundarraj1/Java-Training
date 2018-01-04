package com.learnJava;

public class Task implements Priority,Complexity,Comparable{

    String taskName, priority;
    int complexity;


    public Task(String taskNam, String pri,int complex){
        taskName = taskNam;
        priority= pri;
        complexity=complex;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        taskName = taskName;
    }

    @Override
    public void setPriority(String pri) {
        priority = pri;
    }

    @Override
    public String getPriority() {
        return priority;
    }

    @Override
    public void setComplexity(int complex) {
        complexity=complex;
    }

    @Override
    public int getComplexity() {
        return complexity;
    }

    @Override
    public int compareTo(Object o) {

        Task task1 = (Task) o;

        if(task1.getComplexity() > complexity){
            return -1;
        }else if(task1.getComplexity() < complexity){
            return 1;
        }else if(task1.complexity==complexity){
            return 0;
        }

        return 0;
    }
}
