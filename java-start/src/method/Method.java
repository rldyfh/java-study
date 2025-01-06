package method;

public class Method {
    public static void main(String[] args) {
        add(1,2);

        double number = 1.5;
        int number2 = 1;
//        printNumber(number); // 컴파일 에러

        // double이 int 보다 값의 범위가 더 크다.
        printNumber((int) number); // 명시적 형변환 double -> int
        printNumber2(number2); // 자동 형변환 int -> double
    }

    // 위의 1 ,2 처럼 넘기는 값을 argument, 인자, 인수 라고 한다.
    // 메서드 선언의 a, b를 parameter, 매개변수라고 한다.
    public static int add(int a, int b) {
        return a + b;
    }


    // ※ 자바는 항상 변수의 값을 복사해서 대입한다. 꼭 기억하자
    // 참조형도 위의 대원칙과 같다. 참조값을 복사해서 대입한다.
    public static void method1() {
        int num1 = 5;
        int num2 = num1; // 사실 num1의 값을 복사해서 num2에 대입한다.
    }


    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
    public static void printNumber2(double n) {
        System.out.println("숫자 : " + n);
    }

    // 메서드 오버로딩
    // 파라미터의 개수가 다르거나 다른 타입의 순서가 다를 경우 오버로딩
    public static void method2(int a, double b, int c) {
        System.out.println("int a double b int c");
    }
    public static void method2(int a, double b) {
        System.out.println("int a double b");
    }
    public static void method2(double a, int b) {
        System.out.println("double a, int b");
    }

    // 메서드 오버로딩
    // 메서드 시그니처 = 메서드 이름 + 파라미터 타입(순서)
    // 메서드 시그니처가 다르면 다른 메서드로 간주한다.
    public static int add2(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }
    // 반환 타입은 시그니처로 들어가지 않기 때문에 같은 메서드로 봐서 컴파일 오류
//    public static double add2(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    public static double add2(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
