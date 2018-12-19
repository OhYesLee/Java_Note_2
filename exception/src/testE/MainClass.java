package testE;

public class MainClass {

    public static void main(String[] args) {
        
        int i = 10;
        int j = 0;
        int r = 0;

        System.out.println("Exception BEFORE");

        // 어떠한 정수를 0으로 나눌 수 없으므로 예외가 발생한다. 흐름을 방해하지 않기 위해 exception 처리한다.
        try {
            r = i / j;
        } catch (Exception e) {
            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println("msg: " + msg);
        }
    
        System.out.println("Exception AFTER");

    }

}