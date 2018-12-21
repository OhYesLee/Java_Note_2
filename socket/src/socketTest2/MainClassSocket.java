package socketTest2;

import java.io.IOException;
import java.net.Socket;

public class MainClassSocket {

    public static void main(String[] args) {

        // 소켓 만들고 객체만 생성해주면 금방 만들 수 있다. 예외문 때문에 길어 보이는 것.
        Socket socket = null;

        try {
            socket = new Socket("localhost", 9000); // 127.0.0.1
            System.out.println("server connected");
            System.out.println("socket:" + socket);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}