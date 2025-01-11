package final1;

import memory.Data;

public class ConstructorInit {

    // 상수의 변수명은 대문자, 관례
    static final int CONST_VALUE = 10;
    final int value;
    final Data data = new Data();
    // data = new Data(); // 컴파일 오류, data의 참조값을 변경할 수 없지 data의 데이터(필드)는 변경 가능

    public static void main(String[] args) {

    }

    // final 이 붙은 변수는 생성자에서 초기화 가능하다.
    public ConstructorInit(int value) {
        this.value = value;
    }

}
