package generic.test;

import generic.animal.Animal;

// T extends Animal : 타입 매개변수를 제한한다. T의 상한은 Animal로 제한된다.
public class AnimalHospitalV2<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
         System.out.println("동물 이름: " + animal.getName());
         System.out.println("동물 크기: " + animal.getSize());
         animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
