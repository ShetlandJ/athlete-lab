package myfirstgame.athleteprogram;

/**
 * Created by James on 30/10/2017.
 */

public class Gymnast extends Athlete {


    int difficulty;
    int pointsForExecution;

    public Gymnast(String name, int difficulty, int pointsForExecution) {
        super(name);
        this.difficulty = difficulty;
        this.pointsForExecution = pointsForExecution;
    }

    public void prepare() {
        System.out.println("preps leotard");
    }

    public void compete(){
        System.out.println("swish swosh swoooo");
    }

    public void calculatePoints(){
        super.setPoints(difficulty + pointsForExecution);
    }


}
