public class Pilot extends CabinCrewMember {
    private String licenceNumber;

    public Pilot(String name, CabinCrewType cabinCrewType, String licenceNumber) {
        super(name, cabinCrewType);
        this.licenceNumber = licenceNumber;
    }


    public String flyPlane() {
        return "Wow! I'm flying a plane! Now if I can only remember how to land the goshdarn thing...";
    }
}
