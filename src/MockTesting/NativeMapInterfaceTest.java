package MockTesting;

import Business.User;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class NativeMapInterfaceTest {

    public NativeMapInterface nativemapmock = new NativeMapMock() {
    };

    @Before
    public void setUp() {
    }

    @Test
    public void testGetUserLocation (){
        User expectedResult = new User("John", "Smith", "12345, -12345");
        User actualResult = nativemapmock.getUserLocation("12345, -12345");
        assertEquals(expectedResult.getUserLocation(), actualResult.getUserLocation());
    }
}