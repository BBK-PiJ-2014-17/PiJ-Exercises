import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class PrimeDivisorListImpl implements PrimeDivisorList {

    private List<Integer> l;

    public PrimeDivisorListImpl() {
        l = new ArrayList<Integer>();
    }

    @Override
    public boolean add(Integer i) throws NullPointerException, IllegalArgumentException {

        boolean ret = true;

        if (i == null) {
            ret = false;
            throw new NullPointerException("Input is NULL.");
        } else if (!primeTest(i)) {
            ret = false;
            throw new IllegalArgumentException("Input is not prime.");
        } else {
            ret = l.add(i);
        }

        return ret;

    }

    @Override
    public String toString() {

        Hashtable<Integer, Integer> primes = new Hashtable<Integer, Integer>;
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        //sb.append("[");

        for (Integer i : l) {

            primes.put(i);

        }

        for (Integer j : primes) {

            System.out.println(primes.getValue(j));

        }

        return sb.toString;

    }

    private boolean primeTest(int input) {

        boolean prime = true;

        if (input == 1) {
            prime = false;
        } else if (input > 1 && input < 4) {
            prime = true;
        } else if (input > 3) {
            int i = 1;

            while (i < input/2) {
                i++;
                if (input % i == 0) {
                    prime = false;
                }
            }

        }

        return prime;
    }

}