import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Amy Poehler", CabinCrewType.PILOT, "PawneeAir555");
    }

    @Test
    public void canGetPilotName() {
        assertEquals("Amy Poehler", pilot.getName());
    }

    @Test
    public void checkPilotCanFly() {
        assertEquals("Wow! I'm flying a plane! Now if I can only remember how to land the goshdarn thing...", pilot.flyPlane());
    }

}
