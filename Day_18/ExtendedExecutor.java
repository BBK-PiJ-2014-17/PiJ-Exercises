public class ExtendedExecutor extends ExecutorImpl {

    public ExtendedExecutor(){
        super();
    }

    public ExtendedExecutor(int maxThreads) {
        super(maxThreads);
    }

    public int getMaxPendingTime() {

        int total = 0;

        for (Runnable r : totalQueue) {

            SleepTask s = (SleepTask) r;
            total += s.getSleepTime();

        }

        return total;

    }

}