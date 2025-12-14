import java.rmi.*;

public interface DateService extends Remote {
    String getDate() throws RemoteException;
}
