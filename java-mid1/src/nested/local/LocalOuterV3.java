package nested.local;

import java.lang.reflect.Field;

/*
    지역 변수는 생명주기가 짧다. 해당 지역변수가 사용된 메서드가 종료되면 스택에서 사라지는데
    아래 예제와 같이 지역변수 메서드 콜이 끝난 후에도 print()시 지역변수가 유지되는걸 볼 수 있다.
       -> 내부적으로 힙 영역의 인스턴스에 지역변수를 캡처해둬서 보관해서 접근할 때 이것에 접근한다.
 */
public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        // 지역 클래스가 접근하는 지역변수는 사실상 final 변수이다.
        int localVar = 1;
        // final int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        //localVar = 10; // 인스턴스에 캡처한 변수와 지역 변수간 동기화가 되지 않는다!

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 outer = new LocalOuterV3();
        Printer printer = outer.process(2);
        printer.print();

        /*
            field = int nested.local.LocalOuterV3$1LocalPrinter.value
            field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
            field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar
            field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0 // 바깥 클래스의 참조 변수도 포함하고 있다.
         */
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
