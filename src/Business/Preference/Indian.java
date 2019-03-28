package Business.Preference;

public class Indian extends PreferenceDecorator {

    public final Preference preference;

    public Indian(Preference preference){
        this.preference = preference;
    }
    @Override
    public String gettypeRestaurant() {
        return preference.gettypeRestaurant()+", Takeaway";
    }

    @Override
    public String getcuisine() {
        return preference.getcuisine()+", Indian";
    }
    @Override
    public String gettypeFood() {
        return preference.gettypeFood()+", curry";
    }
    @Override
    public String getdietaryRestrictions() {
        return preference.getdietaryRestrictions()+", Vegan";
    }
    @Override
    public String getallergyInformation() {
        return preference.getallergyInformation()+", Vegan";
    }

}
