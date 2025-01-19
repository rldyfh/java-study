package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // 접근제어자 -> private
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 열거형도 클래스이기때문에 메서드를 추가할 수 있다.
    public int getDiscountPercent() {
        return discountPercent;
    }
}
