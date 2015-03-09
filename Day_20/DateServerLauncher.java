import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RMISecurityManager;
import java.rmi.Naming;
import java.net.MalformedURLException;

public class DateServerLauncher {

    public static void main(String[] args) {
        new DateServerLauncher().launch();
    }

    private void launch() {
        // 1. If there is no security manager, start one
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            // 2. Create the registry if there is not one
            LocateRegistry.createRegistry(1099);
            // 3. Create the server object
            DateServer server = new DateServer();
            // 4. Register (bind) the server object on the registy.
            // The registry may be on a different machine
            String registryHost = "//localhost/";
            String serviceName = "date";
            Naming.rebind(registryHost + serviceName, server);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }

}