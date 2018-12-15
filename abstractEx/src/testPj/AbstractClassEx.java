package testPj;

public abstract class AbstractClassEx {

    int num;
    String str;

    public AbstractClassEx() {
        System.out.println("AbstractClassEx Constructor");
    }

    public AbstractClassEx(int i, String s) {
        System.out.println("AbstractClassEx Constructor");

        this.num = i;
        this.str = s;
    }

    public void fun1() {
        System.out.println(" -- fun1() START -- ");
    }

    // 추상 메소드 (상속받는 클래스는 반드시 이 추상 메소드를 구현해야 한다.)
    public abstract void fun2();

}