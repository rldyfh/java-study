package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 원본상태가 그대로 유지되고 변경사항을 새 복사본에 포함하는 과정을 간결하게 표현.
    // setYear보다 이런식으로 불변객체를 수정하고 객체를 반환할 때 with+ 로 이름 짓는다.
    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate setMonth(int month) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate setDay(int day) {
        return new ImmutableMyDate(year, month, day);
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
