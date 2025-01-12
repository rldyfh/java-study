package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMehtod();

        // 상속 관계일 때 객체를 생성하면 그 객체와 부모의 인스턴스만 생성됨.
        // 지금은 Parent만 생성했고 Child의 인스턴스는 만들어지지 않은 형태. 따라서 Child의 정보가 없어 ClassCastException이 발생.
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMehtod();
    }
}
