package lang.immutable.address;

public class ImmutableAddress {

    // fianl로 선언하여 불변으로 만든다.
    private final String value;
//    private String value; // 또는 setter를 없애고 생성할 때만 초기화가 가능하도록 한다.

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
