import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketScanner {
    static void singular(String host, int port){
        try{
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), 1000);
            System.out.println("Port "+port+" on host "+host+" is open");
            socket.close();
        }catch(Exception e){
            System.out.println("Port "+port+" on host "+host+" is closed");
        }
    }

    static void completescan(String host){
        for (int port = 0; port <= 65535; port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(host, port), 1000);
                System.out.println("Port "+port+" on host "+host+" is open");
                socket.close();
            } catch (IOException e) {
                System.out.println("Port "+port+" on host "+host+" is closed");
            }
        }
    }
}
