package UnitTesting;

import Business.Restaurant;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    @Test
    public void getRestaurantName() throws Exception{
        Restaurant mcdonalds = new Restaurant("McDonalds","American","Cheeseburger", "456, -456");
        assertEquals("McDonalds", mcdonalds.getRestaurantName());
    }


    @Test
    public void getcuisine() throws Exception {
        Restaurant american = new Restaurant ("McDonalds","American","Cheeseburger","456, -456");
        assertEquals("American", american.getcuisine());
    }

    @Test
    public void getTypeFood() throws Exception {
        Restaurant cheeseburger = new Restaurant ("McDonalds","American","Cheeseburger","456, -456");
        assertEquals("Cheeseburger", cheeseburger.getTypeFood());
    }

    @Test
    public void getRestaurantLocation() throws Exception {
        Restaurant loction = new Restaurant ("McDonalds","American","Cheeseburger","456, -456");
        assertEquals("456, -456", loction.getRestaurantLocation());
    }
}