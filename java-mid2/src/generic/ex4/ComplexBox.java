package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }


    // 만약 제네릭 Z를 T로 고치면 동작은 하지만 헷갈림. 모호하니까 바꾸자!!!!!!
    // 그리고 제네릭 메서드가 제네릭 타입보다 높은 우선순위를 가진다.
    // Z는 extends로 상한이 없어서 Object의 기능만 가져올 수 있다.
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("z.className: " + z.getClass().getName());
        return z;
    }
}
