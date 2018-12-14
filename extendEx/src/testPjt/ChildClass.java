package testPjt;

public class ChildClass extends ParentClass {
    
    // 클래스 네임과 동일한 생성자 메소드
    public ChildClass() {
        System.out.println("ChildClass Constructor");
    }

    public void childFun() {
        System.out.println("childFun()");
    }
    
}