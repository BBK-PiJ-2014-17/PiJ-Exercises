import java.util.List;
import java.util.ArrayList;

public class ResponsiveUI {

    private int input = 10;
    private List<Task> tasks;

    public static void main(String[] args) {

        ResponsiveUI rui = new ResponsiveUI();
        rui.launch();


    }

    private void launch() {

        int task = 0;
        tasks = new ArrayList<Task>();

        while(input > 0) {

            printInputRequest(task);
            printTaskFinish();

            input--;
            task++;
        }

        boolean fin = false;

        for (Task t : tasks) {

            if (t.isRunning()) {

                fin = true;

            }

        }

        if (fin) {

            System.out.println("Thread still waiting to finish...");

        } else {

            System.out.println("Program finished.");

        }

    }

    private synchronized void printInputRequest(int task) {

        String str;
        int length;

        System.out.print("Enter duration of task (in ms) " + task + ": ");
        str = System.console().readLine();
        length = Integer.parseInt(str);

        Task t = new Task(length, task);
        tasks.add(t);

        Thread tr = new Thread(t);
        tr.start();

    }

    private synchronized void printTaskFinish() {

        StringBuilder sb = new StringBuilder();

        for (Task t : tasks) {

            if (!t.isRunning() && !t.getReported()) {

                t.setReported(true);
                sb.append(t.getId() + ", ");

            }

        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            System.out.println("Tasks finished: " + sb.toString());
        }

    }

}