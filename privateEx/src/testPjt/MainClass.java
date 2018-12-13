package testPjt;

public class MainClass {

    public static void main(String[] args) {

        Student student1 = new Student("호날두", 90);

        student1.getInfo();

        student1.setScore(70);
        
        String houName = student1.getName();
        int houScore = student1.getScore();

        System.out.println(houName);
        System.out.println(houScore);
    }
}