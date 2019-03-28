package UnitTesting;

import Business.Preference.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class AmericanTest {
    @Test
    public void gettypeRestaurant () throws Exception{
        Preference preference = new Italian();
        American restaurant = new American(preference);
        assertEquals("Sit in, Takeaway", restaurant.gettypeRestaurant());
    }

    @Test
    void getcuisine() throws Exception {
        Preference preference = new Italian();
        American cuisine = new American(preference);
        assertEquals("Italian, American", cuisine.getcuisine());
    }

    @Test
    void gettypeFood() throws Exception{
        Preference preference = new Italian();
        American food = new American (preference);
        assertEquals("Pasta, Cheeseburger", food.gettypeFood());
    }

    @Test
    void getdietaryRestrictions() throws Exception{
        Preference preference = new Italian();
        American restriction = new American(preference);
        assertEquals("Gluten Free, None", restriction.getdietaryRestrictions());
    }

    @Test
    void getallergyInformation() throws Exception{
        Preference preference = new Italian();
        American allergy = new American(preference);
        assertEquals("None, Vegan", allergy.getallergyInformation());
    }

}