package MockTesting;

import Business.Restaurant;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class GoogleAwarenessMockTest {

    public GoogleAwarenessMockInterface googleawarenessmock = new GoogleAwarenessMock() {
    };

    @Before
    public void setUp() {
    }

        @Test
        public void testGetRestaurant (){
            Restaurant expectedResult = new Restaurant("Five Guys", "American", "Cheeseburger", "123, -123");
            Restaurant actualResult = googleawarenessmock.getRestaurant("Five Guys", "American", "Cheeseburger", "123, -123");
            assertEquals(expectedResult.getRestaurantName(), actualResult.getRestaurantName());
            assertEquals(expectedResult.getcuisine(), actualResult.getcuisine());
            assertEquals(expectedResult.getTypeFood(), actualResult.getTypeFood());
            assertEquals(expectedResult.getRestaurantLocation(), actualResult.getRestaurantLocation());
        }
    }