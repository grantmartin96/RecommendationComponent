package Business.Preference;

public abstract class PreferenceDecorator implements Preference {

    @Override
    public String gettypeRestaurant() {
        return "Updates";
    }
    @Override
    public String getcuisine() {
        return "Updates";
    }
    @Override
    public String gettypeFood() {
        return "Updates";
    }
    @Override
    public String getdietaryRestrictions() {
        return "Updates";
    }
    @Override
    public String getallergyInformation() {
        return "Updates";
    }

}
