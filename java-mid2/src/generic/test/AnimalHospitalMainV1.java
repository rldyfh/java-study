package generic.test;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1<Dog> dogAnimalHospital = new AnimalHospitalV1<>();
        AnimalHospitalV1<Cat> catAnimalHospital = new AnimalHospitalV1<>();
        AnimalHospitalV1<Integer> animalHospital = new AnimalHospitalV1<>(); // 여러개의 타입이 들어올 수 있다.. 제한을 할 필요가 있음.
        AnimalHospitalV1<Object> animalHospital1 = new AnimalHospitalV1<>(); // 여러개의 타입이 들어올 수 있다.. 제한을 할 필요가 있음.
    }
}
