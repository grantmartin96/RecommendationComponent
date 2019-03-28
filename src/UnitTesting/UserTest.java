package UnitTesting;

import Business.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void getFirstName()throws Exception {
        User grant = new User("Grant","Martin", "123, -123");
        assertEquals("Grant", grant.getFirstName());

    }

    @Test
    public void getLastName()throws Exception {
        User martin = new User("Martin", "Martin", "123, -123");
        assertEquals("Martin", martin.getLastName());
    }

    @Test
    public void getUserLocation()throws Exception {
        User location = new User ("Grant", "Martin", "123, -123");
        assertEquals("123, -123", location.getUserLocation());
    }
}