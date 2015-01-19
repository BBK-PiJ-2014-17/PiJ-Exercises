import java.util.List;
import java.util.ArrayList;

public class HailstonesTest {

    public static void main(String[] args) {

        List<Integer> seq = Hailstones.hailstoneNumbers(10);

        for (Integer i : seq) {
            System.out.println(i);
        }

    }
}