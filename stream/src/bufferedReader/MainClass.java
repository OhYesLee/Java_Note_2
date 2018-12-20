package bufferedReader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

        String fileName = "C:\\java\\helloReader.txt";

        //  데이터 자료형 , 변수 초기화
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // 파일 리더를 확장하여 buffered 리더를 만든다.
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String strLine;
            // readLine 으로 한라인씩 읽는다.
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}