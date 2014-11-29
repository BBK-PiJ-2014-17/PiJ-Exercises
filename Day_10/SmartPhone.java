/**
 * A class that extends class MobilePhone.
 */
public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String address) {
        System.out.println("Browsing the web at address " + address);
    }

    public String findPosition() {
        return "40 26 46 N 79 58 56 W";
    }

    @Override
    public void call(String number) {
        if (number.substring(0,2).equals("00")) {
            System.out.println("Calling " + number + " via the internet");
        } else {
            super.call(number);
        }
    }

}