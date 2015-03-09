import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.rmi.Naming;

public class DateClient {

    DateService dateService;

    public static void main(String[] args) {
        new DateClient().launch();
    }

    private void launch() {

        try {

            Remote service = Naming.lookup("//127.0.0.1:1099/date");
            dateService = (DateService) service;
            dateService.getDate();

        } catch (RemoteException exception) {
            exception.printStackTrace();
        } catch (NotBoundException exception) {
            exception.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

    }

}