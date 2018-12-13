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

        // 사용자 정의 생성자를 호출한다. (디폴트 생성자와는 다르게 매개변수를 사용한다.)

        int arr[] = {10,20,30};
        ObjClass obj4 = new ObjClass("Java", arr);
        ObjClass obj5 = new ObjClass(10, 20);

        // 객체의 속성 출력
        obj5.getInfo();

    }
}
