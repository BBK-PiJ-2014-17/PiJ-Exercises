/**
 * A class that extends class OldPhone.
 */
public class MobilePhone extends OldPhone {

    private String[] lastTenNumbers = new String[10];

    public MobilePhone(String brand) {
        super(brand);
    }

    public void ringAlarm(String time) {
        System.out.println("Alarm set for " + time);
    }

    public void playGame(String game) {
    //private void playGame(String game) {
        System.out.println("Playing game " + game);
    }

    public void printLastNumbers() {
        for (int i = 0; i < lastTenNumbers.length; i++) {
            System.out.println(i + " : " + lastTenNumbers[i]);
        }
    }

}