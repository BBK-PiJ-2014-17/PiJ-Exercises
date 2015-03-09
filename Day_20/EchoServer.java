import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoServer extends UnicastRemoteObject implements EchoService {

    public EchoServer() throws RemoteException {
        // nothing to initialise for this server
    }

    @Override
    public String echo(String s) {
        System.out.println("Replied to some client saying ’" + s + "’");
        return s;
    }

}