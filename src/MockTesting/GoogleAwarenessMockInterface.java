package MockTesting;

import Business.Restaurant;

public interface GoogleAwarenessMockInterface {

    Restaurant getRestaurant(String restaurantName, String cuisine, String typeFood, String restaurantLocation);

}
