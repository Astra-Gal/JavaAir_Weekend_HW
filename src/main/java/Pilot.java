public class Pilot extends CabinCrewMember {
    private String licenceNumber;

    public Pilot(String name, CabinCrewType cabinCrewType, String licenceNumber) {
        super(name, cabinCrewType);
        this.licenceNumber = licenceNumber;
    }


}
