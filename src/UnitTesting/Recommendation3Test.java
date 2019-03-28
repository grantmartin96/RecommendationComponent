package UnitTesting;

import Business.Recommendation.Recommendation3;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Recommendation3Test {
    @Test
    public void restaurantName() throws Exception {
        Recommendation3 recommendation = new Recommendation3();
        assertEquals("McDonalds",recommendation.restaurantName);
    }
    @Test
    public void distance() throws Exception {
        Recommendation3 recommendation = new Recommendation3();
        assertEquals("0.3 miles",recommendation.distance);
    }
    @Test
    public void roundTripTime() throws Exception {
        Recommendation3 recommendation = new Recommendation3();
        assertEquals("20 minutes",recommendation.roundTripTime);
    }
    @Test
    public void currentNumberPeople() throws Exception {
        Recommendation3 recommendation = new Recommendation3();
        assertEquals("18",recommendation.currentNumberPeople);
    }

}