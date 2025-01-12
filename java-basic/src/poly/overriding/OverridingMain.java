package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {

        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.mehtod();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.mehtod();

        // 부모 변수가 자식 인스턴스 참조
        // Poly 변수는 Parent 타입. Parent 인스턴스부터 참조. value는 부모꺼, method는 오버라이딩 된 얘가 있으므로 오버라이딩 된 얘를 우선으로 참조.
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 X
        poly.mehtod(); // 메서드는 오버라이딩


    }
}
