package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat("java");
        System.out.println(str); // "hello"

        String str2 = str.concat("java");
        System.out.println(str2);

        /*
            String은 불변 클래스이다.
            concat시 리턴값이 존재한다.
         */

    }
}
