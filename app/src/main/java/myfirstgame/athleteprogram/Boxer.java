package myfirstgame.athleteprogram;

/**
 * Created by James on 30/10/2017.
 */

public class Boxer extends Athlete {

    int hitsGiven;
    int hitsTaken;

    public Boxer(String name, int hitsGiven, int hitsTaken) {
        super(name);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public void prepare() {
        System.out.println("Oils gloves");
    }

    public void compete(){
        System.out.println("Boof boof bash");
    }

    public void calculatePoints(){
        super.setPoints(hitsGiven - hitsTaken);
    }
}
