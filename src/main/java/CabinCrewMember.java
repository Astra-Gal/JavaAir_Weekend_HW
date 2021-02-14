public class CabinCrewMember {

    private String name;
    private CabinCrewType cabinCrewType;

    public CabinCrewMember(String name, CabinCrewType cabinCrewType) {
        this.name = name;
        this.cabinCrewType = cabinCrewType;

    }

    public String getName() {
        return this.name;
    }

    public CabinCrewType getRank() {
        return this.cabinCrewType;
    }
}
