import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * An interface of the date service.
 */

public interface DateService extends Remote {
    /**
     * Returns the date and time at point of call
     * @return Calendar object with time now
     */
    public Calendar getDate() throws RemoteException;
}