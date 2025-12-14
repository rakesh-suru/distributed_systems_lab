import java.net.*;
import java.io.*;

public class DNS {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch;

        do {
            System.out.println("\n1.DNS  2.Reverse DNS  3.Exit");
            System.out.print("Enter choice: ");
            ch = Integer.parseInt(br.readLine());

            try {
                if (ch == 1) {
                    System.out.print("Enter Host Name: ");
                    InetAddress ia = InetAddress.getByName(br.readLine());
                    System.out.println("Host: " + ia.getHostName());
                    System.out.println("IP: " + ia.getHostAddress());
                }

                else if (ch == 2) {
                    System.out.print("Enter IP Address: ");
                    InetAddress ia = InetAddress.getByName(br.readLine());
                    System.out.println("IP: " + ip);
                    System.out.println("Host: " + ia.getHostName());
                }
            } catch (Exception e) {
                System.out.println("Invalid Host or IP");
            }

        } while (ch != 3);
    }
}
