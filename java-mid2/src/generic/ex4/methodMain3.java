package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class methodMain3 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Dog dog2 = new Dog("멍멍이2", 200);
        Cat cat = new Cat("야옹이", 100);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("return cat = " + returnCat);
    }
}
