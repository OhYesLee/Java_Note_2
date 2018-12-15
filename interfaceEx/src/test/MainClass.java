package test;

public class MainClass {

    public static void main(String[] args) {
        
        InterfaceA ia = new InterfaceClass();
        InterfaceB ib = new InterfaceClass();

        // 데이터 타입이 인터페이스 A이므로 funA() 메소드만 사용이 가능. funB() 메소드는 사용이 불가능
        ia.funA();

        // 데이터 타입이 인터페이스 B이므로 funB() 메소드만 사용이 가능. funB() 메소드는 사용이 불가능
        ib.funB();
        
    }

}