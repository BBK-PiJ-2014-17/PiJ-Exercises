import java.util.List;
import java.util.ArrayList;

public class Hailstones {

    public static List<Integer> hailstoneNumbers(int n) {
        return hailstoneNumbers(n, new ArrayList<Integer>());
    }

    private static List<Integer> hailstoneNumbers(int n, List<Integer> seq) {

        List<Integer> ret = new ArrayList<Integer>();
        int next;

        if (n == 1) {

            System.out.println(n);

            ret.add(n);

        } else {

            System.out.println(n);

            if (n % 2 == 0) {   //  even

                next = n / 2;

            } else {            // odd

                next = 3 * n + 1;

            }

            seq.add(n);

            hailstoneNumbers(next, seq);

        }

        System.out.println("Returning " + n);

        return ret;

    }

}