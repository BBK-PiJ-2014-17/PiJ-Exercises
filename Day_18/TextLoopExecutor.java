import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class TextLoopExecutor {

    public static void main(String[] args) {

        TextLoopExecutor tle = new TextLoopExecutor();
        tle.launch(args);

    }

    public void launch(String[] args) {

        //ExecutorService executor = Executors.newFixedThreadPool(10);
        Executor executor = new ExecutorImpl(10);

        if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
            System.out.println("USAGE: java TextLoop <mode>");
            System.out.println(" mode 0: without threads");
            System.out.println(" mode 1: with threads");
        } else if (args[0].equals("0")) {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop("Thread " + i);
                r.run();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop("Thread " + i);
                executor.execute(r);
            }
        }

        //executor.shutdown();

    }

}