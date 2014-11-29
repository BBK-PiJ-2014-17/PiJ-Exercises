/**
 * A script that creates and tests the SmartPhone class
 */
public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    public void launch() {

        SmartPhone sp = new SmartPhone("Nokia");

        sp.call("02085602751");
        sp.call("00448863645366");

        sp.ringAlarm("12:00");

        sp.playGame("Mario");

        sp.browseWeb("www.google.com");

        System.out.println(sp.findPosition());

        System.out.println("Brand: " + sp.getBrand());

    }
}