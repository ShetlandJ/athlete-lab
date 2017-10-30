package myfirstgame.athleteprogram;

import java.io.IOException;

/**
 * Created by James on 30/10/2017.
 */

public interface AthleteLog {
    void writeToFile(String line) throws IOException;
    void writeToConsole(String line);
}
