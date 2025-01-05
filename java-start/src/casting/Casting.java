package casting;

public class Casting {
    public static void main(String[] args) {

        // 값의 범위가 int < long < double
        // 작은 범위의 값을 큰 타입에 넣을 수 있음. 자동 형변환
        int a = 10;
        long b;
        double c;
        b = a;
        System.out.println(b); // 10
        c = a;
        System.out.println(c); // 10.0


        // 큰 범위를 작은 범위로 바꾸면 형변환을 직접 해줘야함.
        // 명시적 형변환
        // 숫자의 손실이 발생함.
        int a2;
        double b2 = 1.5;
        //a2 = b2; // 컴파일 오류 발생
        a2 = (int) b2;
        System.out.println(a2); // 1


        // 정수형 타입의 리터럴은 int 형. 2147483647까지만 사용할 수 있다.
//        long maxIntOver = 2147483648; // 컴파일 오류
        long maxIntOver = 2147483648L;
        int intValue = 0;
        System.out.println(intValue = (int) maxIntOver); // 오버플로우 -2147483648   


        // 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
        double div1 = 3 / 2; // 결과 1 (int)
        System.out.println(div1); // int -> double로 자동 형변환 1.0

        // 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 된다.
        double div2 = 3.0 / 2; // double 과 int -> double / double - > double로 형변환이 됨
        System.out.println(div2); // 1.5

        double div3 = (double) 3 / 2; // doube / int -> double
        System.out.println(div3); // 1.5
    }
}
