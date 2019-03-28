package UnitTesting;

import Business.Preference.Chinese;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChineseTest {

    @Test
    public void gettypeRestaurant () throws Exception{
        Chinese restaurant = new Chinese();
        assertEquals("Sit in", restaurant.gettypeRestaurant());
    }

    @Test
    void getcuisine() throws Exception {
        Chinese cuisine = new Chinese();
        assertEquals("Chinese", cuisine.getcuisine());
    }

    @Test
    void gettypeFood() throws Exception{
        Chinese food = new Chinese ();
        assertEquals("Rice", food.gettypeFood());
    }

    @Test
    void getdietaryRestrictions() throws Exception{
        Chinese restriction = new Chinese();
        assertEquals("None", restriction.getdietaryRestrictions());
    }

    @Test
    void getallergyInformation() throws Exception{
        Chinese allergy = new Chinese();
        assertEquals("Nuts", allergy.getallergyInformation());
    }
}