package objMemory;

public class ObjClass {

    // 속성 변수 (객체 내에서 전역)
    public int x;
    public int y;
    
    public ObjClass() {

        System.out.println("test");
        
    }

    // 중복 메서드 (오버로딩)
    public ObjClass(String s, int[] Arr) {

        // 배열은 객체이기 때문에 배열의 주소가 적히게 된다.
        System.out.println("s ---->" + s);
        System.out.println("iArr ---->" + Arr);

    }

    public ObjClass(int x, int y) {
        // 매개 변수 (메소드 내에서 지역)
        this.x = x;
        this.y = y;

    }

    public void getInfo() {
        // System.out.println("x ---> " + this.x); 와 같다.
        System.out.println("x ---> " + x);

        // System.out.println("x ---> " + this.y); 와 같다.
        System.out.println("y ---> " + y);
    }

}