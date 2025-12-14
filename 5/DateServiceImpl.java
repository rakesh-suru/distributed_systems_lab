import java.rmi.server.*;
import java.rmi.*;
import java.util.Date;

public class DateServiceImpl extends UnicastRemoteObject
        implements DateService {

    protected DateServiceImpl() throws RemoteException {
        super();
    }

    public String getDate() throws RemoteException {
        return new Date().toString();
    }
}
