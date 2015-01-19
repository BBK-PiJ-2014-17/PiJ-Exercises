public class MFibTest {

    public static void main(String[] args) {

        int n = 45;
        long before, after;

        System.out.println("\nTiming MFib\n\n");

        before = System.currentTimeMillis() % 1000;
        System.out.println("Before:\t\t" + before);

        MFib.mFib(n);

        after = System.currentTimeMillis() % 1000;
        System.out.println("After " + n + ":\t" + after);

        System.out.println("\nMFib Total time: " + (after - before));

        System.out.println("\nTiming Fib\n\n");

        before = System.currentTimeMillis() % 1000;
        System.out.println("Before:\t\t" + before);

        MFib.fib(n);

        after = System.currentTimeMillis() % 1000;
        System.out.println("After " + n + ":\t" + after);

        System.out.println("\nFib Total time: " + (after - before));
    }

}