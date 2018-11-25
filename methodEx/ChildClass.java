package methodEx;

public class ChildClass {

    public String name;
    public String gender;
    public int age;

    public ChildClass() {
        System.out.println("-- childClass constructor --");
    }

    public void setInfo(String n, String g, int a) {
        System.out.println(" -- setInfo() START-- ");

        name = n;
        gender = g;
        age = a;
    }

    public void getInfo() { // 선언부
        // 정의부
        System.out.println(" -- getInfo() - I -- ");

        System.out.println(" name : " + name);
        System.out.println(" gender : " + gender);
        System.out.println(" age : " + age);
    }

    public void getInfo(int x, int y) { // 오버로딩 - 중복 메서드 (overloading)
        System.out.println(" -- getInfo - II -- ");
        System.out.printf("parameter --> x : %d, y : %d\n", x, y);
    }

}