import java.rmi.*;

public class DateClient {
    public static void main(String[] args) throws Exception {

        DateService service =
            (DateService) Naming.lookup("rmi://localhost/DateService");

        System.out.println("Server Date: " + service.getDate());
    }
}
