package generic.ex5;

import generic.animal.Animal;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();

        writeBox(objectBox);
        writeBox(animalBox);
        //writeBox(dogBox); // 컴파일 에러!
    }

    // super == 하한, Animal 보다 상위에 있는 클래스들만 들어올 수 있다.
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
