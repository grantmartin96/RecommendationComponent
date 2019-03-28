package Business;

public class User  {
    private String firstName;
    private String lastName;
    private String userLocation;

    public User(String firstName, String lastName, String userLocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userLocation = userLocation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getUserLocation() {
        return userLocation;
    }

}
