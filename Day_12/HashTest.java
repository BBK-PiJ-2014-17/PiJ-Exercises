import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class HashTest {

    private Integer input;
    private Integer expected;

    @Before
    public void setup() {
        // pass
    }

    public HashTest(Integer input, Integer expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection process() {

        Object[][] data = new Object[][] {{100, 100},
                                            {1001, 0},
                                            {null, null}
        };
        return Arrays.asList(data);

    }

    @Test
    public void test() {
        assertEquals((int) expected, (int) HashUtilities.shortHash(input));
    }

}