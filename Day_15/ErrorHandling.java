import java.util.List;
import java.util.ArrayList;

public class ErrorHandling {

    public static void main(String[] args) {

        ErrorHandling eh = new ErrorHandling();
        eh.launch();
    }

    private void launch() {

        int max, sum = 0, count = 0, input;
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter the number of integers to be provided.");
        max = getIntegerInput("\nNot a number! Please re-enter!!\n");

        while(count < max) {

            input = getIntegerInput("\nNot a number! Please re-enter!!\n");
            list.add(input);
            count++;

        }

        for (int i : list) {
            sum += i;
        }

        System.out.println("Average of inputs: " + (double) sum/max);

    }

    private int getIntegerInput(String err) {

        String str;
        int input = 0;
        boolean b = true;

        while(b) {

            try {

                System.out.print(">> ");
                str = System.console().readLine();
                input = Integer.parseInt(str);
                b = false;

            } catch (NumberFormatException ex) {

                System.out.println(err);

            }

        }

        return input;

    }

}