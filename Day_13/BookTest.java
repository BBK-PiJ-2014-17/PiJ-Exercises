import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {

    Book b;
    String inputAuthor;
    String inputTitle;

    @Before
    public void buildUp() {

        inputAuthor = "Pierre";
        inputTitle = "A Book";

        b = new BookImpl(inputAuthor, inputTitle);

    }

    @Test
    public void testGetAuthor() {

        //assertEquals("Basil", b.getAuthor());             // fail
        assertEquals(inputAuthor, b.getAuthor());           // pass
    }

    @Test
    public void testGetTitle() {

        //assertEquals("Not A Book", b.getTitle());         // fail
        assertEquals(inputTitle, b.getTitle());             // pass
    }

}