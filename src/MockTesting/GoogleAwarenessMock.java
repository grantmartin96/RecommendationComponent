package MockTesting;

import Business.Restaurant;

public abstract class GoogleAwarenessMock implements GoogleAwarenessMockInterface {


    public Restaurant getRestaurant(String restaurantName, String cuisine, String typeFood, String restaurantLocation) {
        Restaurant restaurant = new Restaurant("Five Guys", "American","Cheeseburger", "123, -123");
        return restaurant;

    }

}
