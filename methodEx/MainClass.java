package methodEx;

public class MainClass {
    public static void main(String[] args) {

        ChildClass child1 = new ChildClass();

        // 속성 값을 설정하는 좋지 않은 방법
        child1.name = "hong gil dong";
        child1.gender = "M";
        child1.age = 20;

        // 속성 값을 설정하는 좋은 방법
        child1.setInfo("hong gil soon", "W", 17);

        child1.getInfo(); // 호출부

        child1.getInfo(10, 20); // 오버로딩(중복 메서드) 호출
        
    }
}   