import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServer() throws RemoteException {
        // nothing to initialise for this server
    }

    @Override
    public double add(double x, double y) throws RemoteException {
        return x + y;
    }

    @Override
    public double subtract(double x, double y) throws RemoteException {
        return x - y;
    }

    @Override
    public double multiply(double x, double y) throws RemoteException {
        return x * y;
    }

    @Override
    public double divide(double x, double y) throws RemoteException {
        return (y != 0) ? x/y : 0;
    }

}