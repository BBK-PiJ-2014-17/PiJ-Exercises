import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {

    Library lib;
    User u;
    String inputName;
    int inputMaxBooks;

    @Before
    public void buildUp() {

        inputName = "Pierre's Library";
        inputMaxBooks = 5;

        lib = new LibraryImpl(inputName);
        u = new UserImpl("Basil");

    }

    @Test
    public void testLibrary() {

        assertEquals("Basil", lib.getLibraryName());             // fail
        //assertEquals(inputName, lib.getLibraryName());           // pass

        lib.setMaxBooksPerUser(inputMaxBooks);

        assertEquals(6, lib.getMaxBooksPerUser());             // fail
        //assertEquals(inputMaxBooks, lib.getMaxBooksPerUser());           // pass
    }

}