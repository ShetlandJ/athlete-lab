package myfirstgame.athleteprogram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by James on 30/10/2017.
 */

public abstract class Athlete implements AthleteLog {

    String name;
    private int points;
    private ArrayList<Medal> medals;
    private ArrayList<Integer> runs;

    public Athlete(String name) {
        this.name = name;
        this.points = 0;
        this.medals = new ArrayList<>();
        this.runs = new ArrayList<>();
    }

    protected void addMedal(Metals metal) {
        medals.add(new Medal(metal));
    }

    protected void awardMedal() {
        if (this.points >= 15) {
            addMedal(Metals.GOLD);
        } else if (this.points >= 10) {
            addMedal(Metals.SILVER);
        } else if (this.points >= 5) {
            addMedal(Metals.BRONZE);
        }
    }

    public void setPoints(int points) {
        this.points = points;
    }

    protected abstract void prepare();

    protected abstract void compete();

    protected abstract void calculatePoints();

    protected void enterEvent() {
        prepare();
        compete();
        calculatePoints();
        awardMedal();
    }

    public Metals lastMedal() {
        Medal lastMedal = this.medals.get(medals.size() - 1);
        return lastMedal.getMetal();
    }

    public void addRun(int runLength) throws IOException {
        this.runs.add(runLength);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH);
        Date date = new Date();
        String new_line = dateFormat.format(date) + ", " + runLength + ", " + totalRunDistance();

        writeToFile(new_line);
    }

    public int totalRunDistance() {
        int total = 0;
        for (Integer run : runs) {
            total += run;
        }
        return total;
    }

    public void writeToFile(String line) throws IOException {
        String filename = name + "_athlete_log.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
        writer.append(line);
        writer.append('\n');

        writer.close();
    }

    public void writeToConsole(String line){

    }


}
