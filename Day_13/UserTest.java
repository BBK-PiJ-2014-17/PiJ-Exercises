import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {

    User u;
    Library lib;
    String inputName;
    int inputId;

    @Before
    public void buildUp() {

        inputName = "Pierre";
        inputId = 123;

        u = new UserImpl(inputName);
        lib = new LibraryImpl("New Library");

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

    @Test
    public void testUserRegister() {

        //assertEquals(5, u.register(lib));         // fail
        assertEquals(1, u.register(lib));           // pass

    }

}