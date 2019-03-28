package UnitTesting;

import Business.Recommendation.Recommendation2;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Recommendation2Test {
    @Test
    public void restaurantName() throws Exception {
        Recommendation2 recommendation = new Recommendation2();
        assertEquals("KFC",recommendation.restaurantName);
    }
    @Test
    public void distance() throws Exception {
        Recommendation2 recommendation = new Recommendation2();
        assertEquals("1.1 miles",recommendation.distance);
    }
    @Test
    public void roundTripTime() throws Exception {
        Recommendation2 recommendation = new Recommendation2();
        assertEquals("15 minutes",recommendation.roundTripTime);
    }
    @Test
    public void currentNumberPeople() throws Exception {
        Recommendation2 recommendation = new Recommendation2();
        assertEquals("8",recommendation.currentNumberPeople);
    }

}