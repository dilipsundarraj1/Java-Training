package com.learnJava.anatomyClass;

/**
 * Created by z001qgd on 12/21/17.
 */
public class BasketBallPlayer {

    /**
     * Properties
     */
    private int jerseryNumber;
    private String playerName;
    private int pointsScored;


    /**
     * Default Constructor
     */
    public BasketBallPlayer(){

    }

    /**
     * Constructor with Arguments
     * @param jerseryNum
     * @param playerNam
     * @param pointScored
     */
    public BasketBallPlayer(int jerseryNum, String playerNam, int pointScored) {
        jerseryNumber = jerseryNum;
        playerName = playerNam;
        pointsScored = pointScored;
    }

    public static void main(String[] args) {

        BasketBallPlayer basketBallPlayer = new BasketBallPlayer(1,"Dilip", 5);
    }


}
