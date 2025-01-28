package generic.ex1;

public class BoxMain {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println(integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println(string);
    }
}
