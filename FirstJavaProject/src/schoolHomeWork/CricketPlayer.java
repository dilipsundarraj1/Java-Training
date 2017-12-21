package schoolHomeWork;

/**
 * Created by z001qgd on 12/12/17.
 */
public class CricketPlayer {

    private String name;
    private int jerSeyNumber;

    public int getJerSeyNumber() {
        return jerSeyNumber;
    }

    public void setJerSeyNumber(int jerSeyNumber) {
        this.jerSeyNumber = jerSeyNumber;
        System.out.println(name);
       // System.out.println(name1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
        System.out.println(name);
    }



    @Override
    public String toString() {
        return "CricketPlayer{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        CricketPlayer cricketPlayer = new CricketPlayer();

        cricketPlayer.setName("Dilip");

        System.out.println(cricketPlayer);



    }
}
