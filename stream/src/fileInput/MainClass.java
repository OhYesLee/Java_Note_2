package fileInput;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {
        
        // 네트워크나 아래의 읽기쓰기 관련 코드는 예외처리를 반드시 해주어야 한다.
        // 안할 경우 컴파일 에러 발생!

        // read()
        InputStream inputStream = null;
        try {
            // 읽을 파일 위치를 지정해준다.
            inputStream = new FileInputStream("C:\\java\\hello.txt");
            int data = 0;

            while(true) {

                try { // 파일 안에 있는 것을 1바이트 단위로 계속 읽어온다. 아스키 코드로 표현된다.
                    data = inputStream.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(data == -1) break; // 더이상 읽을게 없으면 break로 빠져나온다.
                System.out.println("data : " + data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null) inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println();

        // read(byte[]) 원하는 바이트 단위로 빨리 읽고 싶을 때. 배열의 크기만큼 읽어오는 방법
        InputStream inputStream2 = null;
        try {
            
            inputStream = new FileInputStream("C:\\java\\hello.txt");
            int data = 0;
            byte[] bs = new byte[3];

            // 3바이트 단위로 끊었기 때문에, 배열에 나중에 딱 맞아 떨어지지 않는 데이터 찌꺼기가 남을 수 있다.
            while(true) {

                try {
                    data = inputStream.read(bs);
                } catch (IOException e ) {
                    e.printStackTrace();
                }
                if(data == -1) break;
                System.out.println("data : " + data);
                for (int i = 0; i < bs.length; i++) {
                    System.out.println("bs[" + i + "] : " + bs[i]);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       
    }
}