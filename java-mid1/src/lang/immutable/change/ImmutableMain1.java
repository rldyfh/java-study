package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        // 계산한 후에도 기존값이 유지되며 더한 값도 알 수 있다.
        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
    }
}
