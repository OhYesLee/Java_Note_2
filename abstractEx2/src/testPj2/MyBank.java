package testPj2;

public class MyBank extends Bank {

    public MyBank(String name, String account, int totalAmount) {
        super(name, account, totalAmount);
    }

    // 추상 클래스를 상속받은 자식 클래스인 Bank에서 추상 메소드 installmentSavings 구현
    @Override
    public void installmentSavings() {
        System.out.println(" -- installmentSavings() --");
    }

    // 추상 클래스를 상속받은 자식 클래스인 Bank에서 추상 메소드 cancellation 구현
    @Override
    public void cancellation() {
        System.out.println(" -- cancellation() --");
    }
}