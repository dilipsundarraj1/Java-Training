package schoolHomeWork;

/**
 * Created by z001qgd on 12/6/17.
 */
public class BasketBallPlayer {

    private String name;
    private int jerseyNumber;
    private String position;
    private int pointScored;

    public BasketBallPlayer(String name1,int jerseyNumber1,String position1,int pointScored1){
        name = name1;
        jerseyNumber=jerseyNumber1;
        position=position1;
        pointScored=pointScored1;

    }

    public void setJersey(int jerseyNumber1){
        jerseyNumber = jerseyNumber1;
    }

    public int addPoints(int newpoints){

        if(newpoints<0){
            System.out.println( newpoints + " is an invalid value for points");
            return pointScored;
        }
        return pointScored =  pointScored+newpoints;
    }

    public static void main(String[] args) {

        BasketBallPlayer basketBallPlayer = new BasketBallPlayer("Esha", 1, "Forward", 100);

        System.out.println(basketBallPlayer.jerseyNumber);
        System.out.println(basketBallPlayer.name);
        System.out.println(basketBallPlayer.position);
        System.out.println(basketBallPlayer.pointScored);

        basketBallPlayer.setJersey(2);


        System.out.println(basketBallPlayer.jerseyNumber);

        basketBallPlayer.addPoints(-20);

        System.out.println(basketBallPlayer.pointScored);
    }

}
