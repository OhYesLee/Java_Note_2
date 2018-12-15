package testPjt;

public class MainClass {

    public static void main(String[] args) {

        // 자식 클래스로부터 객체를 생성했다. Parent의 생성자가 먼저 호출된다.
        ChildClass child = new ChildClass();

        // 자식 클래스 안의 ChildFun() 메소드 실행
        child.childFun();

        // 부모 클래스로부터 상속받은 ParentFun() 메소드 실행
        child.parentFun();

        // 부모 클래스에서 private로 접근자가 설정되어 있으므로 child 에서 privateFun 로는 접근이 불가능하다.
    
    }

}

