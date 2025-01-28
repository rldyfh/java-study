package generic.ex1;

/*
    <> 를 사용한 클래스: 제네릭 클래스(== 제네릭 타입)
    T를 타입 매개변수라고 한다. T는 나중에 Integer, String으로 변할 수 있다.
    타입 매개변수의 관례
    T - Type
    E - Element
    K - Key
    N - Number
    V - Value
    제네릭 타입 인자로는 기본형X, 래퍼클래스 가능(Integer, Double...)
 */
public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
