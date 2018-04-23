package com.learnJava.maze;

public class MazeSearchNew {

    public static void main(String[] args) {

        MazeNew maze = new MazeNew();
        System.out.println(maze);
        if(maze.traverse(0,0)){
            System.out.println("The maze was successfully solved");
           // System.out.println(maze);
        }else{
            System.out.println("There is no possible path.");
        }
    }
}
