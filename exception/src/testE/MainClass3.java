package testE;

public class MainClass3 {

    public static void main(String[] args) {
        
        MainClass3 mainClass3 = new MainClass3();   

        try {
            mainClass3.firstMethod(); // 이곳에서 예외처리를 하게 된다.
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void firstMethod() throws Exception { // 호출한 곳인 main으로 보낸다.
        secondMethod();
    }

    public void secondMethod() throws Exception { // 호출한 곳인 first로 보낸다.
        thirdMethod();
    }

    public void thirdMethod() throws Exception { // 호출한 곳인 second로 보낸다.
        System.out.println("10 / 0 =" + ( 10 / 0 ));
    }

}