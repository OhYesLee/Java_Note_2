package dataOutput;

import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {
        
        String str = "Hello Java World!!";
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            outputStream = new FileOutputStream("C:\\java\\helloWorld.txt");
            // outputStream 을 확장, 즉 업그레이드 한 클래스라고 생각하자.
            dataOutputStream = new DataOutputStream(outputStream);

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