package variable;

public class Var {
    public static void main(String[] args) {
        // long 타입은 뒤에 L 을 붙인다. 소문자 l도 가능하나 1과 헷갈릴 수 있음.
        long a = 922222222222L;

        // 거의 대부분 실수를 표현할 때 double을 사용.
        double b = 10.0;

        // float은 뒤에 f를 붙힘.
        // 표현 범위가 double보다 작아서 소수점 계산이 잘 안될때가 있다.(정밀도가 너무 낮음. double 사용!)
        float c = 10.0f;

        // 파일 전송, 파일 복사 등을 할 때 주로 사용.
        byte d = 127;
    }
}
