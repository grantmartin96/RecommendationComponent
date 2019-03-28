package Business.Preference;

class TestDecoratorPattern {

    public static void main(String[] args) {

        Preference preference = new Chinese();

        preference = new Indian(preference);

        System.out.println("Type of Restaurant: "+preference.gettypeRestaurant());
        System.out.println("Chosen Cuisine: "+preference.getcuisine());
        System.out.println("Type of Food: "+preference.gettypeFood());
        System.out.println("Dietary Restrictions: "+preference.getdietaryRestrictions());
        System.out.println("Allergy Information: "+preference.getallergyInformation());

        preference = new American(preference);

        System.out.println("Type of Restaurant: "+preference.gettypeRestaurant());
        System.out.println("Chosen Cuisine: "+preference.getcuisine());
        System.out.println("Type of Food: "+preference.gettypeFood());
        System.out.println("Dietary Restrictions: "+preference.getdietaryRestrictions());
        System.out.println("Allergy Information: "+preference.getallergyInformation());

    }
}
