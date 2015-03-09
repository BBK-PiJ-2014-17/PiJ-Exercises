import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.rmi.Naming;

public class CalculatorClient {

    CalculatorService calculatorService;

    public static void main(String[] args) {
        new CalculatorClient().launch();
    }

    private void launch() {

        try {

            Remote service = Naming.lookup("//127.0.0.1:1099/calculator");
            calculatorService = (CalculatorService) service;

            System.out.println(calculatorService.add(1.0, 3.0));
            System.out.println(calculatorService.subtract(1.0, 3.0));
            System.out.println(calculatorService.multiply(1.0, 3.0));
            System.out.println(calculatorService.divide(1.0, 3.0));

        } catch (RemoteException exception) {
            exception.printStackTrace();
        } catch (NotBoundException exception) {
            exception.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

    }

}