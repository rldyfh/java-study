package generic.ex5;

import generic.animal.Animal;

// 제네릭 타입이나 제네릭 메서드가 필요한 경우가 아니면 와일드 카드를 권장.
public class WildcardEx {

    // 제네릭 메서드
    // Box<Dog> 전달한다 -> 타입 추론에 의해 T는 Dog가 된다.
    public <T> void printGeneric(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 와일드 카드
    // Box<Dog> 전달한다 -> 와일드카드 ?는 모든 타입을 받을 수 있다.
    public static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    public static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    // T의 타입이 뭐냐에 따라 리턴 타입이 달라진다.
    public static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    // 반면 와일드카드는 이미 정해진 제네릭타입(부모가 Animal인 클래스들)이 들어와서 box.get()가 Animal타입 리턴으로 고정되어 버린다.
    public static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
