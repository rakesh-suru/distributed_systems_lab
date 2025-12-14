import java.rmi.*;
import java.rmi.registry.*;

public class DateServer {
    public static void main(String[] args) throws Exception {

        LocateRegistry.createRegistry(1099); // registry created here
        DateService service = new DateServiceImpl();
        Naming.rebind("DateService", service);

        System.out.println("Date Server Ready");
    }
}
