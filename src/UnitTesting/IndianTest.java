package UnitTesting;

import Business.Preference.Chinese;
import Business.Preference.Indian;
import Business.Preference.Preference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndianTest {

    @Test
    public void gettypeRestaurant () throws Exception{
        Preference preference = new Chinese();
        Indian restaurant = new Indian(preference);
        assertEquals("Sit in, Takeaway", restaurant.gettypeRestaurant());
    }

    @Test
    void getcuisine() throws Exception {
        Preference preference = new Chinese();
        Indian cuisine = new Indian(preference);
        assertEquals("Chinese, Indian", cuisine.getcuisine());
    }

    @Test
    void gettypeFood() throws Exception{
        Preference preference = new Chinese();
        Indian food = new Indian (preference);
        assertEquals("Rice, curry", food.gettypeFood());
    }

    @Test
    void getdietaryRestrictions() throws Exception{
        Preference preference = new Chinese();
        Indian restriction = new Indian(preference);
        assertEquals("None, Vegan", restriction.getdietaryRestrictions());
    }

    @Test
    void getallergyInformation() throws Exception{
        Preference preference = new Chinese();
        Indian allergy = new Indian(preference);
        assertEquals("Nuts, Vegan", allergy.getallergyInformation());
    }
}