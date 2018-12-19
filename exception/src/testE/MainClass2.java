package testE;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class MainClass2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i, j;
        ArrayList<String> list = null;

        int[] iArr = {0, 1, 2, 3, 4};

        System.out.println("Exception Before");

        try {

            System.out.println("input i : ");
            i = scanner.nextInt();
            System.out.println("input j : ");
            j = scanner.nextInt();

            System.out.println("i / j = " + ( i / j ));

            for (int k = 0; k < 5; k++) {
                System.out.println("iArr["+ k +"] : " + iArr[k]);
            }

            System.out.println("list.size() : " + list.size());

        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("예외 발생 여부에 상관없이 언제나 실행됩니다.");
        }

        System.out.println("Exception After");
    }
}