import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * An interface of the calculator service.
 */

public interface CalculatorService extends Remote {
    /**
     * Adds the two doubles provided
     * @return sum of doubles
     */
    public double add(double x, double y) throws RemoteException;

    /**
     * Subtracts the two doubles provided
     * @return subtraction of doubles
     */
    public double subtract(double x, double y) throws RemoteException;

    /**
     * Multiplies the two doubles provided
     * @return product of doubles
     */
    public double multiply(double x, double y) throws RemoteException;

    /**
     * Divides the two doubles provided
     * @return divsion of doubles
     */
    public double divide(double x, double y) throws RemoteException;
}