package dataOutput;

import java.io.InputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {
        
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            inputStream = new FileInputStream("C:\\java\\helloWorld.txt");
            // inputStream 을 확장, 즉 업그레이드 한 클래스라고 생각하자.
            // inputStream, outputStream 으로도 파일 복사가 가능하지만,
             // 바이트 단위로 다루기 불편하므로 문자열 단위로 다루기 위해서 data 확장을 사용할 것이다.
            dataInputStream = new DataInputStream(inputStream);

            String str = dataInputStream.readUTF();
            // inputStream 에 있는 것을 outputStream에 복사할 것이다.

            outputStream = new FileOutputStream("C:\\java\\helloWorldCopy.txt");
            dataOutputStream = new DataOutputStream(outputStream);

            // 읽어온 파일의 내용을 데이터아웃풋스트림에 쓴다.
            // 파일이 복사될 것이다.
            dataOutputStream.writeUTF(str);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(dataOutputStream != null) dataOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if(outputStream != null) outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}