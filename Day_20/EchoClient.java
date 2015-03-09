import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.rmi.Naming;

public class EchoClient {

    EchoService echoService;

    public static void main(String[] args) {
        new EchoClient().launch(args[0]);
    }

    private void launch(String input) {

        try {

            Remote service = Naming.lookup("//127.0.0.1:1099/echo");
            echoService = (EchoService) service;
            String receivedEcho = echoService.echo(input);

        } catch (RemoteException exception) {
            exception.printStackTrace();
        } catch (NotBoundException exception) {
            exception.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

    }

}