package operator;

public class Operator {
    public static void main(String[] args) {

        // 문자열에 int 값을 '+' 하면 int가 String으로 변한다.
        int num = 10;
        String str = "a + b = ";
        String result = str + num;
        System.out.println(result);

        // 문자열에 어느 타입이던 '+' 하면 해당 타입이 String으로 변한다.
        boolean b = true;
        String str2 = "boolean value = ";
        String result2 = str2 + b;
        System.out.println(result2);

        // 둘의 결과는 같으나 sum2이 sum1에 비해 괄호를 사용하여 명확하다. 한 눈에 알아보기 쉽도록 sum2처럼 사용하자
        int sum1 = 2 * 2 + 3 * 3;
        int sum2 = (2 * 2) + (3 * 3);
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
