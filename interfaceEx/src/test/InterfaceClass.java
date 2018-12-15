package test;

// 인터페이스를 구현한 클래스에는 implements 키워드를 사용한다.
// 상속은 다중 상속을 지원하지 않지만, 인터페이스는 여러개를 사용할 수 있다.
// 즉 인터페이스 A도 될 수 있고, 인터페이스 B 도 될 수 있다. (다형성)
public class InterfaceClass implements InterfaceA, InterfaceB {

    // 생성자
    public InterfaceClass() {
        System.out.println(" -- InterfaceClass Constructor -- ");
    }

    // 인터페이스의 메소드에 오버라이드
    @Override
    public void funA() {
        System.out.println(" -- funA() -- ");
    }

    @Override
    public void funB() {
        System.out.println(" -- funB() -- ");
    }

}