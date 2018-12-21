package socketTest;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {

    public static void main(String[] args) {

        // 레퍼런스 변수 하나 만들어놓고 null 처리해주자.
        // 일단 변수만 선언해놓고 초기화하진 않는다.
        ServerSocket serverSocket = null;
        Socket socket = null;

        // 네트워크나 파일 시스템은 반드시 예외처리를 해주자.
        try {

            // 미리 만들어 놓은 레퍼런스 변수에다가 포트번호를 넣어준다.
            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비 완료!!");

            // 받는 메소드, 소켓을 반환해준다.
            socket = serverSocket.accept();
            System.out.println("클라이언트 연결!!");
            System.out.println("socket : " + socket);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(socket != null) socket.close();
                if(serverSocket != null) serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}