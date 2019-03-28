package Business;

public class Restaurant {
    private String RestaurantName;
    private String cuisine;
    private String typeFood;
    private String restaurantLocation;

    public Restaurant(String restaurantName, String cuisine, String typeFood, String restaurantLocation) {
        this.RestaurantName = restaurantName;
        this.cuisine = cuisine;
        this.typeFood = typeFood;
        this.restaurantLocation = restaurantLocation;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public String getcuisine() {
        return cuisine;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }
}

