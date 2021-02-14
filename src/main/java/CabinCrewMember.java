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

    public String relayMessage() {
        return "Passengers are reminded that smoking in the toilets is strictly prohibited and will result in being ejected unceremoniously from the plane in middair";
    }
}
