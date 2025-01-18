package lang.wrapper;

/*
    자바가 제공하는 래퍼클래스는 모두
     - 불변이다.
     - equals로 비교해야 한다. (클래스의 참조 비교가 되니까..)
 */
public class WrapperClassMain {
    public static void main(String[] args) {

        Integer newInteger = new Integer(10); // deprecated!
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 범위의 숫자들은 자바가 미리 만들어 놓은 숫자들을 재사용한다.

        System.out.println(integerObj);

        System.out.println("==: " + (newInteger == integerObj)); // false
        System.out.println("equals: " + newInteger.equals(integerObj)); // true
    }
}
