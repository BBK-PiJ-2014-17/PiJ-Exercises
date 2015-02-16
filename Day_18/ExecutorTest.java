import java.util.concurrent.Executor;

public class ExecutorTest {

    public static void main(String[] args) {

        ExecutorTest et = new ExecutorTest();
        et.launch();

    }

    private void launch() {

        //Executor e = new ExecutorImpl();
        //Executor e = new ExecutorImpl(5);
        Executor e = new ExecutorImpl(10);
        e.execute(new SleepTask(1, 1000));
        e.execute(new SleepTask(2, 20000));
        e.execute(new SleepTask(3, 15000));
        e.execute(new SleepTask(4, 500));
        e.execute(new SleepTask(5, 3000));
        e.execute(new SleepTask(6, 45));
        e.execute(new SleepTask(7, 456));
        e.execute(new SleepTask(8, 23));
        e.execute(new SleepTask(9, 678));
        e.execute(new SleepTask(10, 234));
        e.execute(new SleepTask(11, 1000));
        e.execute(new SleepTask(12, 4566));
        e.execute(new SleepTask(13, 463));
        e.execute(new SleepTask(14, 500));
        e.execute(new SleepTask(15, 3000));

    }

}