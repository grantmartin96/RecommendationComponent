package MockTesting;


import Business.User;

public abstract class NativeMapMock implements NativeMapInterface {


    public User getUserLocation(String userLocation) {
        User user = new User("John", "Smith","12345, -12345");
        return user;

    }

}
