package poly.car1;

public class OcpPrinciple {

    /*
        OCP - Open Closed Principle
        Open for extension: 새로운 기능의 추가나 변경 사항이 생겼을 때, 기존 코드는 확장할 수 있어야 한다.
        Closed for modification: 기존의 코드는 수정되지 않아야 한다.

        확장에 열려있다.
            - Car 인터페이스를 통해 새로운 Car를 추가할 수 있다.
            - Driver도 Car 인터페이스를 통해 새롭게 추가된 차량을 자유롭게 호출할 수 있다.

        코드 수정은 닫혀 있다.
            - 새로운 기능이 추가되기 때문에 기존 코드의 수정은 불가피하다.

        변하는 부분
            - Car 인터페이스를 사용하는 Driver의 코드는 수정하지 않아도 된다.
            - 당연히 main은 수정된다.

        결론
            - Car를 사용하는 코드인 Driver 코드의 변경없이 새로운 자동차를 확장할 수 있다.
            - 전략 패턴
     */
}
