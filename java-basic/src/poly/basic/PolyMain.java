package poly.basic;

public class PolyMain {
    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMehtod();

        // 부모 변수가 자식 인스턴스 참조
        // 부모는 자식을 담을 수 있다.(부모는 마음이 넓으니까...)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // Child child1 = new Parent(); // 컴파일 오류 발생, 자식은 부모를 담을 수 없다.

        // 자식의 기능은 호출할 수 없다.
        // poly는 Parent 타입이므로 Parent를 먼저 참조함.
        // 상속관계는 부모 방향으로 찾아 올라가서 찾을 수는 있지만, 자식 방향으로는 찾을 수 없음. -> 자식이 있는지도 모르니까~
        // 따라서 자식 메서드들은 호출 불가능.
        // poly.childMehtod();
    }
}
