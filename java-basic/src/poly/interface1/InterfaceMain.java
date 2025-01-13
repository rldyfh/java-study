package poly.interface1;

public class InterfaceMain {

    public static void main(String[] args) {

        // 인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        Dog dog = new Dog();
        soundAnimal(dog);

        Bird bird = new Bird();
        flyAnimal(bird);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 끝");
    }
}
