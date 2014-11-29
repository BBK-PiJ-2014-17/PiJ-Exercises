/**
 * A class that extends class SmartPhone and restricts the playGame method.
 * 1 error: attempting to assighn weaker access privileges; was public...
 */
public class RestrictedSmartPhone extends SmartPhone {

    public RestrictedSmartPhone(String brand) {
        super(brand);
    }

    @Override
    private void playGame(String game) {
        System.out.println("No games!");
    }

}