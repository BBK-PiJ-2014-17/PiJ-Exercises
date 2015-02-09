public class Increaser implements Runnable {

    private final Object LOCK = new Object();
    private Counter c;

    public Increaser(int i, Counter counter) {
        this.c = counter;
    }

    public static void main(String args[]) {
        Counter counter = new Counter();

        //synchronized (LOCK) {

        //    for (int i = 0; i < 100; i++) {
        //        Increaser increaserTask = new Increaser(counter);
        //        Thread t = new Thread(increaserTask);
        //        t.start();
        //    }

        //}

        for (int i = 0; i < 100; i++) {
            Increaser increaserTask = new Increaser(counter);
            Thread t = new Thread(increaserTask);
           t.start();
        }
    }

    public void run() {

        //synchronized (LOCK) {

            System.out.println("Starting at " + c.getCount());
            for (int i = 0; i < 1000; i++) {

                c.increase();
            }
            System.out.println("Stopping at " + c.getCount());

        //}

    }

}

