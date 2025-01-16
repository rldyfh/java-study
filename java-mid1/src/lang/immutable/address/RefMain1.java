package lang.immutable.address;

public class RefMain1 {

    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a); // 서울
        System.out.println("b = " + b); // 서울

        // 여러 변수가 하나의 객체를 참조하는 것을 막을 수 없다.
        // 아래와 같이 사이드 이펙트 발생
        b.setValue("부산");
        System.out.println("a = " + a); // 부산 (사이트 이펙트 발생!)
        System.out.println("b = " + b); // 부산

    }
}
