package poly.interface1;

/*
    좋은 객체지향 프로그래밍
    1. 역할과 구현을 분리
        - 유연하고 변경에 용이
        - 확장 가능한 설계
        - 클라이언트(요청을 보내는 쪽)에 영향을 주지 않는 변경 가능
        - 인터페이스를 잘~~ 설계
    2. 다형성이 가장 중요하다!
 */
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
