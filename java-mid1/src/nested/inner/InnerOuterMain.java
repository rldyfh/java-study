package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {

        // 개념상 외부 클래스의 인스턴스 안에 내부 클래스의 인스턴스가 생성된다. 라고 이해
        InnerOuter outer = new InnerOuter();
        InnerOuter.inner inner = outer.new inner(); // 항상 outer가 있어야 inner 인스턴스를 생성할 수 있다.
        inner.print();

        System.out.println(inner.getClass());

    }
}
