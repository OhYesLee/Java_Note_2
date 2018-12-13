package testPjt;

public class Student {

    private String name;
    private int score;

    public Student(String n, int s) {
        this.name = n;
        this.score = s;
    }

    public void getInfo() {
        System.out.println(" -- getInfo() -- ");
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }

    public String getName() {
        return name;
    }

    // 이름을 한번 설정하면 바꾸지 못한다고 가정한다면 setName 메소드는 필요치 않다.
    // public void setName(String name) {
    //     this.name = name;
    // }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score > 50) this.score = score;
    }
}