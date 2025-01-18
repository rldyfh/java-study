package lang.wrapper;

public class AutoboxingMain {
    public static void main(String[] args) {
        // primitive -> wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // wrapper -> primitive
        int unboxed = boxedValue.intValue();
        System.out.println(boxedValue); // 7
        System.out.println(unboxed); // 7

        /*
            위의 변환 과정이 너무 귀찮다!, 생각보다 자주 변환해서 사용해야한다.
            자바5부터 auto-boxing, auto-unboxing이 추가됨.
         */
        Integer boxedValue2 = value; // Integer에 int타입, Auto-boxing
        int unboxed2 = boxedValue2; // int타입에 Integer , Auto-unboxing
        System.out.println(boxedValue2); //7
        System.out.println(unboxed2); // 7


    }
}
