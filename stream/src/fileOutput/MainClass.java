package fileOutput;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {
        

        // write()
        OutputStream outputStream = null;
        try {

            outputStream = new FileOutputStream("C:\\java\\helloW.txt");
            // String data에서 getBytes 메서드로 배열을 뽑아온다.
            String data = "Hello java world!!";
            byte[] arr = data.getBytes();

            try {
                // write(byte[] b) 전체 쓰기 (쓰고자 하는것을 배열로 바꿔서 한번에 쓰기) 뿐만 아니라,
                // write(byte[], int off, int len) : off(시작점), len(길이) 로 원하는 만큼 넣어줄 수도 있다.
                outputStream.write(arr, 0, 5);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(outputStream != null) outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}