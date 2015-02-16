import java.util.concurrent.Executor;

public class ExtendedExecutorTest {

    public static void main(String[] args) {

        ExtendedExecutorTest eet = new ExtendedExecutorTest();
        eet.launch();

    }

    private void launch() {

        ExtendedExecutor e = new ExtendedExecutor(10);

        e.execute(new SleepTask(1, 1000));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(2, 20000));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(3, 15000));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(4, 500));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(5, 3000));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(6, 45));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(7, 456));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(8, 23));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(9, 678));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(10, 234));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(11, 1000));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(12, 4566));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(13, 463));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(14, 500));
        System.out.println("Pending: " + e.getMaxPendingTime());
        e.execute(new SleepTask(15, 3000));
        System.out.println("Pending: " + e.getMaxPendingTime());

    }

}