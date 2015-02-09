public class Task implements Runnable {

    private int milliSeconds = 0, id;
    private boolean running, reported;

    public Task (int milliSeconds, int id) {

        this.milliSeconds = milliSeconds;
        this.id = id;
        running = true;
        reported = false;

    }

    public void run() {

        try {
            Thread.sleep(milliSeconds); // sleep until notified
        } catch (InterruptedException ex) {
            // Nothing to do in this case, just wait less...
        }

        running = false;

    }

    public boolean isRunning() {
        return running;
    }

    public void setReported(boolean r) {
        this.reported = r;
    }

    public boolean getReported() {
        return this.reported;
    }

    public int getId() {
        return id;
    }

}