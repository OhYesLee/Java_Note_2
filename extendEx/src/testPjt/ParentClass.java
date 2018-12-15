package testPjt;

public class ParentClass {
    
    // 클래스 네임과 동일한 생성자 메소드
    public ParentClass() {
        System.out.println("ParentClass Constructor");
        // 내부에서만 접근이 가능한 privateFun() 메소드
        privateFun();
    }

    public void parentFun() {
        System.out.println("parentFun()");
    }
    
    private void privateFun() {
        System.out.println("privateFun()");
    }
}