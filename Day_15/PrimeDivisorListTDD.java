import java.util.Arrays;
import java.util.Collection;

//import org.junit.Test;
//import org.junit.Before;
import org.junit.*;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;
//import org.junit.runner.RunWith;
//import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeDivisorListTDD {

    private Integer input;
    private Integer expected;
    private PrimeDivisorList pdl;

    @Before
    public void setup() {
        pdl = new PrimeDivisorList();
    }

    public PrimeDivisorListTDD(Integer input, Integer expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection process() {

        Object[][] data = new Object[][] {  {2, true},
                                            {3, true},
                                            {10, false}
        };

        return Arrays.asList(data);

    }

    @Test
    public void test() {
        assertEquals((int) expected, (int) pdl.add(input));
    }

}