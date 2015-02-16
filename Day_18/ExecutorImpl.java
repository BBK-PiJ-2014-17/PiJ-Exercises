import java.util.concurrent.Executor;
import java.util.LinkedList;
import java.util.Queue;

public class ExecutorImpl implements Executor {

    protected Queue<Runnable> executionQueue, totalQueue;
    private int threadCount, maxThreads;
    private boolean isRunning;

    public ExecutorImpl() { //  single execution
        this(1);
    }

    public ExecutorImpl(int maxThreads) {
        this.executionQueue = new LinkedList<Runnable>();
        this.totalQueue = new LinkedList<Runnable>();
        this.maxThreads = maxThreads;
        this.threadCount = 0;
        this.isRunning = false;
    }

    @Override
    public void execute(Runnable command) {

        if (executionQueue.peek() == null) {
            executionQueue.add(command);
            totalQueue.add(command);
            scheduleStart();
        } else {
            executionQueue.add(command);
            totalQueue.add(command);
        }

    }

    private void scheduleStart() {

        isRunning = true;

        while (isRunning) {

            if (executionQueue.peek() == null) {
                isRunning = false;
            } else if (threadCount > maxThreads) {
                // do nothing
            } else {
                Runnable r = executionQueue.poll();
                Thread t = new Thread(r);
                t.start();
            }

        }

    }

}