package com.learnJava.arrayobjects;

import java.util.Random;

public class MysteryBoard {

    int row = 5;
    int column = 5;

    String[][] mystery = new String[row][column];  // 2D String array with 3 rows and 3 columns

    Random rand = new Random();


    public MysteryBoard(){

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                mystery[i][j] = "-";
            }
        }
    }

    public void setMystery(){

        mystery[rand.nextInt(row)][rand.nextInt(column)] = "*";

    }

    public void guess(){

        int guess1 = rand.nextInt(row);
        int guess2 = rand.nextInt(row);
        if(mystery[guess1][guess2].equals("*")){
            mystery[guess1][guess2] = "!";
        }else{
            mystery[guess1][guess2] = "X";
        }
    }

    public String toString(){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(mystery[i][j].equals("*")){
                    mystery[i][j]="-";
                }
                System.out.print(mystery[i][j]+" ");
            }
            System.out.println("\n");
        }

        return "";

    }

    public static void main(String[] args) {
        MysteryBoard  mysteryBoard = new MysteryBoard();
        System.out.println("*** Original Mystery Board ***");
        System.out.println(mysteryBoard);

        mysteryBoard.setMystery();
        mysteryBoard.setMystery();
        mysteryBoard.setMystery();
        mysteryBoard.guess();
        mysteryBoard.guess();
        mysteryBoard.guess();
        mysteryBoard.guess();

        System.out.println("*** Mystery Board after Guess ***");
        System.out.println(mysteryBoard);



    }
}
