import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException {
        // nothing to initialise for this server
    }

    @Override
    public Calendar getDate() {
        Calendar now = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Time requested at: " + format.format(now.getTime()));
        return now;
    }

}