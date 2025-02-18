package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Dog dog2 = new Dog("멍멍이2", 200);
        Cat cat = new Cat("야옹이", 100);

        AnimalMethod.checkup(dog);
        Dog bigger = AnimalMethod.bigger(dog, dog2);
        System.out.println(bigger.getName());
    }
}
