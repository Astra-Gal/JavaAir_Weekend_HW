import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, String flightNumber, String destination, String departureAirport, String departureTime){
        this.plane = plane;
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();

    }
    public int getNumberOfSeats() {
        return this.plane.getNumberOfSeats();
    }


    public int passengerCount() {
        return passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (passengerCount() < this.plane.getNumberOfSeats()) {
            this.passengers.add(passenger);
        }
    }
}
