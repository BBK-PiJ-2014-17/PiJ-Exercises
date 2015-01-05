import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PersonTest {

    private String input, output, expected;

    public PersonTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection process() {

        Object[][] data = new Object[][] { {"Pierre Meyer", "PM"},
                                            {"Pierre  Meyer", "PM"},
                                            {"Basil Mason", "BM"},
                                            {" Basil Mason", "BM"},
                                            {"Basil Mason ", "BM"},
                                            {null, null},

        };
        return Arrays.asList(data);

    }

    @Test
    public void test() {
        output = Person.getInitials(input);
        assertEquals(expected, output);
    }

}