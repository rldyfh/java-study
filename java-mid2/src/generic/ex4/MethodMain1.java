package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(type argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        GenericMethod.<Integer>genericMethod(i);
        GenericMethod.<Double>numberMethod(10.0);

        // 타입 인자(type argument) 명시적 전달
        System.out.println("타입 추론");
        GenericMethod.genericMethod(i);
        GenericMethod.numberMethod(10.0);
    }
}
