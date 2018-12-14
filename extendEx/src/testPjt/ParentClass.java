package testPjt;

public class ParentClass {
    
    // 클래스 네임과 동일한 생성자 메소드
    public ParentClass() {
        System.out.println("ParentClass Constructor");
    }

    public void parentFun() {
        System.out.println("parentFun()");
    }
    
    private void privateFun() {
        System.out.println("privateFun()");
    }
}