import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {

    User u;
    String inputName;
    int inputId;

    @Before
    public void buildUp() {

        inputName = "Pierre";
        inputId = 123;

        u = new UserImpl(inputName);

    }

    @Test
    public void testGetName() {

        //assertEquals("Basil", u.getName());             // fail
        assertEquals(inputName, u.getName());           // pass
    }

    @Test
    public void testSetId() {

        u.setId(inputId);
        //assertEquals(122, u.getId());             // fail
        assertEquals(inputId, u.getId());           // pass
    }

}