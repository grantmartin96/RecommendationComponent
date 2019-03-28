package Business.Preference;

public class Chinese implements Preference {

    @Override
    public String gettypeRestaurant() {
        return "Sit in";
    }
    @Override
    public String getcuisine() {
        return "Chinese";
    }

    @Override
    public String gettypeFood() {
        return "Rice";
    }

    @Override
    public String getdietaryRestrictions() {
        return "None";
    }
    @Override
    public String getallergyInformation() {
        return "Nuts";
    }
}
