package objMemory;

public class MainClass {

    public static void main(String[] args) {
        ObjClass obj1 = new ObjClass();
        ObjClass obj2 = new ObjClass();
        ObjClass obj3 = new ObjClass();

        // 똑같은 클래스에서 객체를 생성했지만 메모리주소가 각기 다른 것을 확인할 수 있다. 
        System.out.println(" obj1 : " + obj1);
        System.out.println(" obj2 : " + obj2);
        System.out.println(" obj3 : " + obj3);
        
    }
}
