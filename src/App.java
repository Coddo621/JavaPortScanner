import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String host;

        System.out.println("1. Scan singular port\n2. Perform complete port scan");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Input the host address you want to scan: ");
                host = input.nextLine();
                System.out.println("Input the port you want to scan on the host address: ");
                int port = input.nextInt();
                SocketScanner.singular(host, port);
                break;
            case 2:
                System.out.println("Input the host address you want to scan: ");
                host = input.nextLine();
                SocketScanner.completescan(host);
                break;
            default:
                break;
        }

        input.close();
    }
}
