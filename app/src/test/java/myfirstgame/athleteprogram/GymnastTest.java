package myfirstgame.athleteprogram;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 30/10/2017.
 */

public class GymnastTest {

    Gymnast gymnast;

    @Before
    public void before(){
        gymnast = new Gymnast("Gary", 10, 6);
    }

    @Test
    public void canEnterEvent() throws Exception {
        gymnast.enterEvent();
        assertEquals(Metals.GOLD, gymnast.lastMedal());
    }

    @Test
    public void canRecordRuns() throws IOException {
        gymnast.addRun(4000);
        gymnast.addRun(500);
        gymnast.addRun(250);
        assertEquals(4750, gymnast.totalRunDistance());
    }


}
