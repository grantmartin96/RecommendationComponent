package UnitTesting;

import Business.Preference.Italian;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItalianTest {

    @Test
     void gettypeRestaurant () throws Exception{
        Italian restaurant = new Italian();
        assertEquals("Sit in", restaurant.gettypeRestaurant());
    }

    @Test
    void getcuisine() throws Exception {
        Italian cuisine = new Italian();
        assertEquals("Italian", cuisine.getcuisine());
    }

    @Test
    void gettypeFood() throws Exception{
        Italian food = new Italian ();
        assertEquals("Pasta", food.gettypeFood());
    }

    @Test
    void getdietaryRestrictions() throws Exception{
        Italian restriction = new Italian();
        assertEquals("Gluten Free", restriction.getdietaryRestrictions());
    }

    @Test
    void getallergyInformation() throws Exception{
        Italian allergy = new Italian();
        assertEquals("None", allergy.getallergyInformation());
    }
}