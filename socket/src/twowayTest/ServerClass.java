package twowayTest;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

    public static void main(String[] args) {
        
        // 레퍼런스 변수 선언
        ServerSocket serverSocket = null;
        Socket socket = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        try {

            serverSocket = new ServerSocket(9000);
            System.out.println("client ready");

            // 소켓을 수신
            socket = serverSocket.accept();
            System.out.println("client connected");
            System.out.println("socket : " + socket);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            while (true) {
                // 클라이언트가 dataOutputStream으로 내보낸 것을 서버에서는 dataInputStream의 readUTF로 받는다.
                String clientMessage = dataInputStream.readUTF();
                System.out.println("ClientMessage" + clientMessage);

                // 서버에서 메세지를 dataOutputStream으로 내보낸다.
                dataOutputStream.writeUTF("Message Transmission");
                dataOutputStream.flush();

                // 메세지가 STOP이면 while문을 빠져나온다.
                if(clientMessage.equals("STOP")) break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(serverSocket != null) serverSocket.close();

                if(socket != null) socket.close();
                
                if(dataOutputStream != null) dataOutputStream.close();
                if(outputStream != null) outputStream.close();
                if(dataInputStream != null) dataInputStream.close();
                if(inputStream != null) inputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}