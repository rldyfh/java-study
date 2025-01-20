package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 정적 중첩 클래스
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 변수에 접근 불가!
            // static 클래스는 인스턴스 변수에 접근 불가
//            System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 가능
            System.out.println(outClassValue);
        }
    }
}
