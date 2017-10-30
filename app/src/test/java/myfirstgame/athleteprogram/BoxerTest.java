package myfirstgame.athleteprogram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 30/10/2017.
 */

public class BoxerTest {

    Boxer boxer;

    @Before
    public void before(){
        boxer = new Boxer("Samantha", 20, 10);
    }

    @Test
    public void canEnterEvent() throws Exception {
        boxer.enterEvent();
        assertEquals(Metals.SILVER, boxer.lastMedal());
    }

}
