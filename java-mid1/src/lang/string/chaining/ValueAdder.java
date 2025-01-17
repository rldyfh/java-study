package lang.string.chaining;

public class ValueAdder {

    private int value;

    // this로 자기 자신을 반환해서 메서드 체이닝을 가능하게 함.
    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }

}
