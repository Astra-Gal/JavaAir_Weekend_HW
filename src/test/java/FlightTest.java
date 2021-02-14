import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    Plane plane;

    Pilot pilot;

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;

    ArrayList<CabinCrewMember> cabinCrewMembers;



    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737);
        pilot = new Pilot("Amy Poehler", CabinCrewType.PILOT, "PawneeAir555");

        cabinCrewMember1 = new CabinCrewMember("Rashida Jones", CabinCrewType.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Aziz Ansari", CabinCrewType.PURSER);
        cabinCrewMember3 = new CabinCrewMember("Nick Offerman", CabinCrewType.CAPTAIN);
        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);
        cabinCrewMembers.add(cabinCrewMember3);

        passenger1 = new Passenger("Adam Scott", 1);
        passenger2 = new Passenger("Aubrey Plaza", 2);
        passenger3 = new Passenger("Chris Platt", 3);

        flight = new Flight(plane, pilot, cabinCrewMembers, "80085", "Indianapolis", "Pawnee International", "17:30");
    }

    @Test
    public void canGetNumberOfSeats() {
        assertEquals(4, plane.getNumberOfSeats());
    }


    @Test
    public void checkPassengerCountStartsAtZero() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.passengerCount());
    }
}
