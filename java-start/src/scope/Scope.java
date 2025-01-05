package scope;

public class Scope {
    public static void main(String[] args) {

        // temp 는 if scope 내에서만 필요함. 불필요한 메모리 낭비.
        // temp로 인해 코드의 복잡성이 증가함. 생각해야할 변수가 늘어난다.
        int m = 10;
        int temp = 0;
        if (m > 0) {
//            int temp *= 2;
            temp *= 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
