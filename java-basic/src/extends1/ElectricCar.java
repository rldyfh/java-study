package extends1;

public class ElectricCar extends Car{

    /*
        상속관계에서 부모 클래스는 자식 클래스의 존재를 모른다.(Car 클래스를 봤을 때 ElectricCar의 존재를 알 수 없음.) 그래서 부모클래스에서 자식 클래스의 기능을 사용할 수 없음.
        자식 클래스는 반대로 extends로 알 수 있기 때문에 기능을 사용가능.
     */

    // Override시 접근 제한자는 부모클래스보다 제한적일 수 없다, 부모가 protected였으면 private일 수 없음.
    // static, final, private인 메서드는 오버라이드 할 수 없다.
    @Override
    public void move() {
        super.move();
    }

    public void charge() {

    }


}

