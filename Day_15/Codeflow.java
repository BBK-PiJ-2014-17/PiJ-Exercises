import java.util.List;
import java.util.ArrayList;

public class Codeflow {

    public static void main(String[] args) {

        Codeflow cf = new Codeflow();
        cf.launch(6);

    }

    private void launch(int userInput) {

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));

            intList.remove(0);
            System.out.println(intList.get(userInput));

            intList.remove(0);
            System.out.println(intList.get(userInput));

            intList.remove(0);
            System.out.println(intList.get(userInput));

            intList.remove(0);
            System.out.println(intList.get(userInput));

            intList.remove(0);
            System.out.println(intList.get(userInput));

            intList.remove(0);
            System.out.println(intList.get(userInput));

        } catch (IndexOutOfBoundsException ex) {

            System.out.println("ERROR");

        }
    }

}