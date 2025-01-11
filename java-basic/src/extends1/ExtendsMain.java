package extends1;


// 1. 상속관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다.
// 2. 상속 관계의 객체를 호출할 때, 대상 타입을 정해야한다. 이 때 호출자의 타입을 통해 대상 타입을 찾는다.
// 3. 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행.
public class ExtendsMain {
    public static void main(String[] args) {

        /*
            자식인 new ElecticCar()하면 부모인 Car까지 인스턴스를 생성한다.
            electricCar에는 참조값이 하나만 저장되지만 그 참조값을 따라가면 Car와 ElectricCar 객체가 생성되어있음.
         */
        ElectricCar electricCar = new ElectricCar();

        /*
            ElectricCar에 정의되어있는 charge()를 호출하면 참조값을 확인.
            charge()를 Car에서 찾을지 ElectricCar에서 찾을지 선택해야함.
            이 때는 '호출하는 변수의 타입' 을 기준으로 선택한다.
         */
        electricCar.charge();

        /*
            electricCar 타입인 ElectricCar 인스턴스의 move()를 호출
            그런데 재정의된 move()가 없으므로 부모인 Car의 move()를 호출
         */
        electricCar.move();

    }
}
