import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Adam Scott", 1);
    }
    @Test
    public void canGetName() {
        assertEquals("Adam Scott", passenger.getName());
    }
}
