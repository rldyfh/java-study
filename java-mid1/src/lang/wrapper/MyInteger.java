package lang.wrapper;

/*
 *  wrapper 클래스
 *  int 형은 primitive 타입, 클래스로 나타낼 수 있다.
 *  primitive타입을 클래스로 감싸는걸 'boxing' 이라고 한다.
 */
public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if(value < target)
            return -1;
        else if(value > target)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
