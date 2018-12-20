package bufferedWriter;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

        String fileName = "C:\\java\\helloWriter.txt";

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String str = "Hello Java World~~\n";
            str += "Hello C World~~\n";
            str += "Hello C++ World~~\n";

            // 파일 리더를 확장하여 buffered 리더를 만든다.
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(str);

            System.out.println("end");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}