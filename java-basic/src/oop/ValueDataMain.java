package oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        data.value = 10;

        // add와 data가 따로 떨어져있다.
        // data의 value를 가져다가 ++ 해줬어야함.
        // data안에 무슨 정보가 있는지까지 알아야함.
        add(data);
        add(data);
        add(data);
        System.out.println("최종 숫자 = " + data.value);

        ValueData data2 = new ValueData();
        data2.value = 10;
        // 속성(멤버 변수) 와 메서드가 한 클래스내에 있다.
        // 클래스내에 어떤 변수가 선언되어있는지 알 필요 없다.
        // 캡슐화
        data2.add();
        data2.add();
        data2.add();
        System.out.println("최종 숫자 = " + data2.value ) ;
    }

    // data도 지역변수
    static void add(ValueData data) {
        data.value++;
    }
}
