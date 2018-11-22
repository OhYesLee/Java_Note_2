package javaOop;

public class Grandeur { // 클래스 이름 : 일반적으로 첫글자는 대문자

    public String color; // 멤버 변수(속성)
    public String gear;
    public int price;

    public Grandeur() { // 생성자 (자바에서의 생성자는 클래스와 이름이 같아야 한다.)
        System.out.println("Grandeur constructor");
    }

    public void run() { // 메서드(기능)
        System.out.println(" -- run() -- ");
    }

    public void stop() { // 메서드(기능)
        System.out.println(" -- stop() -- ");
    }

    public void info() {
        System.out.println(" -- info() -- ");
        System.out.println("color : " + color);
        System.out.println("gear : " + gear);
        System.out.println("price : " + price);
    }

}