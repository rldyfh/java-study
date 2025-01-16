package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // value의 초기값도 유지되면서 결과를 얻을 수 있다.
    public ImmutableObj add(int addValue) {
        return new ImmutableObj(value + addValue);
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }
}
