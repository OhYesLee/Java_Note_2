package testPj;

public class MainClass {

    public static void main(String[] args) {

        // 매개변수와 실행문으로 작성한다. (접근자, 반환형, return 키워드 생략)
        LambdaInterface li = (String s1, String s2, String s3) -> { System.out.println(s1 + " " + s2 + " " + s3);}
        li.method("Hello", "java", "World");

        System.out.println();

        // 매개변수가 1개 이거나 타입이 같을 때, 타입을 생략할 수 있다.
        // 매개변수가 한개로 고정되어 있기 때문에 생략해줄 수 있음.
        LambdaInterface2 li2 = (s1) -> { System.out.println(s1); };
        li2.method("Hello");

        // 실행문이 1개 일 때, '{}'를 생략할 수 있다.
        LambdaInterface2 li3 = (s1) -> System.out.println(s1);
        li3.method("Hello");

        // 매개변수와 실행문이 1개 일 때, '()'와 '{}'를 생략할 수 있다.
        LambdaInterface2 li4 = s1 -> System.out.println(s1);

        // 매개변수가 없을 때, '()'만 작성한다.
        LambdaInterface3 li5 = () -> System.out.println("no parameter");
        li5.method();

        // 반환 값이 있는 경우
        
        LambdaInterface4 li6 = (x, y) -> { // 매개변수의 타입이 같으므로 생략해주었고, 실행문이 2개이므로 중괄호는 생략하지 않고 사용하였따.
            int result = x + y;
            return result;
        };
        System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));
        
        li6 = (x, y) - > { // 람다식을 다시 사용, 익명함수로 익명 객체를 생성하여 원하는 대로 유연하게 메서드를 바꿔줄 수 있다. (곱셈)
            int result = x * y;
            return result;
        };
        System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));

        li6 = (x, y) -> { // 뺄셈으로 메서드를 다시 변경해준 모습
            int result = x - y;
            return result;
        };
        System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));
        
    }

}