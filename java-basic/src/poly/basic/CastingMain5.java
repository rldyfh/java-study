package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    public static void call(Parent parent) {
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음.");
            Child child = (Child) parent;
            child.childMehtod();
        } else {
            System.out.println("Child 인스턴스 아님.");
        }
    }

}
