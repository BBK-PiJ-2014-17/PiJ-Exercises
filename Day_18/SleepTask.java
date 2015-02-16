public class SleepTask implements Runnable {

    private int id, milli;

    public SleepTask(int id, int milli) {
        this.id = id;
        this.milli = milli;
        //this.milli = (milli > 1000) ? 1000 : milli;
    }

    public void run() {

        try {
            System.out.println("\nSleep Task " + id + " starting\n");
            Thread.sleep(milli); // sleep until notified
            System.out.println("\nSleep Task " + id + " finished\n");
        } catch (InterruptedException ex) {
            // Nothing to do in this case, just wait less...
        }

    }

    public int getSleepTime() {
        return this.milli;
    }

}