import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Rashida Jones", CabinCrewType.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetCabinCrewMemberName() {
        assertEquals("Rashida Jones", cabinCrewMember.getName());
    }

    @Test
    public void canGetCabinCrewMemberRank() {
        assertEquals(CabinCrewType.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }
}
