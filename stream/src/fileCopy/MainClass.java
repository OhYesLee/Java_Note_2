package fileCopy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {
        
        // 인터페이스. 자료형을 나타낸다. 객체가 다양한 자료형을 가질 수 있기 때문에 사용된다. (클래스를 구현해야 하는 작업 명세서.)
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            // 파일 위치를 먼저 지정한다.
            inputStream = new FileInputStream("C:\\java\\hello.txt");
            outputStream = new FileOutputStream("C:\\java\\helloCopy.txt");

            // 바이트 배열 선언 (길이 3)
            byte[] arr = new byte[3];

            while(true) {
                // 배열 전체를 입력
                int len = inputStream.read(arr);
                if(len == -1) break;
                outputStream.write(arr, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 내용이 있는지 확인한 후 스트림 종료
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) { e.printStackTrace(); }
            }

            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e) { e.printStackTrace(); }
            }
        }
    }
}