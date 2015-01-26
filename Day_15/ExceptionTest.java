import java.util.List;
import java.util.ArrayList;

public class ExceptionTest {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        et.launch();

    }

    private void launch() {

        List<Integer> list = new ArrayList<Integer>();

        Integer newElement = null;

        try {
            list.add(newElement.intValue());
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}