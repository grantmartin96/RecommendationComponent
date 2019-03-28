package Business.Recommendation;

import java.util.ArrayList;

public class Recommendation {
    public String restaurantName;
    public String distance;
    public String roundTripTime;
    public String currentNumberPeople;

    ArrayList<String> users = new ArrayList<String>();

    public void restaurantName() {
        System.out.println("Name of Restaurant: " + restaurantName);
    }
    public void distance() {
        System.out.println("Distance:" + distance);
    }
    public void roundTripTime() {
        System.out.println("Round Trip Time:" + roundTripTime);
    }
    public void currentNumberPeople(){
        System.out.println("Current Number of People:" + currentNumberPeople);
    }

}