package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 내부 클래스는 바깥 클래스의 인스턴스에 소속된다.
    class inner {
        private int innerInstanceValue = 1;

        public void print() {

            // 자기 자신에 접근
            System.out.println(innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능. private도 가능
            System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능. private도 가능
            System.out.println(outClassValue);
        }
    }


}
