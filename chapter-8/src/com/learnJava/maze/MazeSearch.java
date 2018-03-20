package com.learnJava.maze;

public class MazeSearch {

    public static void main(String[] args) {

        Maze maze = new Maze();
        if(maze.traverse(0,0)){
            System.out.println("The maze was successfully solved");
        }else{
            System.out.println("There is no possible path.");
        }

        System.out.println(maze);
    }
}
