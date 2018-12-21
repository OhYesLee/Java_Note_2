package socketTest2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClassServerSocket {

    public static void main(String[] args) {
        
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(9000);
            System.out.println("client ready");

            socket = serverSocket.accept(); 
            System.out.println("client connected");
            System.out.println("socket: " + socket);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(socket != null) socket.close();
                if(serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}