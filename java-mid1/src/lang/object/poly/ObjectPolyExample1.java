package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {

        // 객체에 맞게 다운캐스팅을 해야한다.
        // instanceof를 이렇게도 쓴다.
        if(obj instanceof Dog dog)
            dog.sound();
        else if(obj instanceof Car car)
            car.move();
    }


}
