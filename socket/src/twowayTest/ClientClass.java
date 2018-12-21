package twowayTest;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Scanner;
import java.net.Socket;

public class ClientClass {

    public static void main(String[] args) {
        
        Socket socket = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        // 데이터 입력 받기 위해 필요한 스캐너 변수 선언
        Scanner scanner = null;

        try {

            socket = new Socket("localhost", 9000);
            System.out.println("server connected");

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            scanner = new Scanner(System.in);

            while(true) {
                System.out.println("Enter a message");
                String outMessage = scanner.nextLine();
                dataOutputStream.writeUTF(outMessage);
                // flush()는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
                dataOutputStream.flush();

                // 서버에서 보낸 데이터를 수신한다.
                String inMessage = dataInputStream.readUTF();
                System.out.println("inMessage : " + inMessage);

                // 메세지가 STOP이면 while문을 빠져나온다.
                if(outMessage.equals("STOP")) break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
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