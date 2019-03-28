package UnitTesting;

import Business.Recommendation.Recommendation1;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Recommendation1Test {
    @Test
    public void restaurantName() throws Exception {
        Recommendation1 recommendation = new Recommendation1();
        assertEquals("Five Guys",recommendation.restaurantName);
    }
    @Test
    public void distance() throws Exception {
        Recommendation1 recommendation = new Recommendation1();
        assertEquals("1.2 miles",recommendation.distance);
    }
    @Test
    public void roundTripTime() throws Exception {
        Recommendation1 recommendation = new Recommendation1();
        assertEquals("35 minutes",recommendation.roundTripTime);
    }
    @Test
    public void currentNumberPeople() throws Exception {
        Recommendation1 recommendation = new Recommendation1();
        assertEquals("21",recommendation.currentNumberPeople);
    }
}