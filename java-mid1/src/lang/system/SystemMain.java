package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {

        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // System.arraycpoy()
        // 배열을 고속으로 복사한다.
        // 운영체제와 하드웨어쪽으로 배열을 보내 속도가 매우 빠름.
        char[] origin = {'h', 'e', 'l', 'l', 'o'};
        char[] copied = new char[5];
        System.arraycopy(origin, 0, copied, 0, origin.length);
        System.out.println(copied.toString()); // [C@4e50df2e -> [ 는 배열, C는 char, 4e50df2e는 참조값
        System.out.println(Arrays.toString(copied));
    }
}
