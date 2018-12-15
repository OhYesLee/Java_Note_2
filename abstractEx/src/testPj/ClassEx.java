package testPj;

public class ClassEx extends AbstractClassEx {

    // 디폴트 생성자
    public ClassEx() {
        System.out.println("ClassEx Constructor");
    }

    // 사용자 정의 생성자 (매개변수 보유)
    public ClassEx(int i, String s) {
        // super - 상속받은 부모 클래스를 나타낸다. 부모 클래스의 사용자 정의 생성자를 호출할 것이다. (매개변수 i, s)
        super(i, s);
    }

    @Override
    public void fun2() {
        System.out.println(" -- fun2() START -- ");
    }
}