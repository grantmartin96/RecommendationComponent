package Business.Preference;

public class American extends PreferenceDecorator{

    private final Preference preference;

    public American(Preference preference){
        this.preference = preference;
    }

    @Override
    public String gettypeRestaurant() {
        return preference.gettypeRestaurant()+", Takeaway";
    }
    @Override
    public String getcuisine() {
        return preference.getcuisine()+", American";
    }
    @Override
    public String gettypeFood() {
        return preference.gettypeFood()+", Cheeseburger";
    }
    @Override
    public String getdietaryRestrictions() {
        return preference.getdietaryRestrictions()+", None";
    }
    @Override
    public String getallergyInformation() {
        return preference.getallergyInformation()+", Vegan";
    }

}
