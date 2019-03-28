package Business.Preference;

public class Italian implements Preference {
    @Override
    public String gettypeRestaurant() {
        return "Sit in";
    }

    @Override
    public String getcuisine() {
        return "Italian";
    }

    @Override
    public String gettypeFood() {
        return "Pasta";
    }

    @Override
    public String getdietaryRestrictions() {
        return "Gluten Free";
    }
    @Override
    public String getallergyInformation() {
        return "None";
    }
}
