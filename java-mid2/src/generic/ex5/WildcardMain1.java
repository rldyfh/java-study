package generic.ex5;

import generic.animal.Animal;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));


        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        // 제네릭 메서드는
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

//        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }
}
