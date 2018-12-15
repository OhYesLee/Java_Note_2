package testMain;

import com.java.toy.Toy;
import com.java.toy.ToyAirplane;
import com.java.toy.ToyRobot;

public class MainClass {

    public static void main(String[] args) {

        Toy robot = new ToyRobot();
        Toy airplane = new ToyAirplane();
        
        // 같은 인터페이스를 공유하므로 자료형 또한 인터페이스로 묶을 수 있다.
        // 배열은 자료형이 같아야 한다. 같은 인터페이스 자료형이므로 배열에 담을 수 있다.
        Toy toys[] = {robot, airplane};

        for (int i = 0; i < toys.length; i++) {
            toys[i].walk();
            toys[i].run();
            toys[i].alarm();
            toys[i].light();

            System.out.println();
        }   

    }
    
}