package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {

        String str1 = "hello"; // 내부적으로 String str1 = new String("hello"); 로 만들어준다.
        String str2 = "hello";
        System.out.println("리터럴 == 비교:" + (str1 == str2)); // true

        /*
            자바는 String str1 = "hello" 와 같이 문자열 리터럴을 사용하면
            메모리 효율성을 위해 '문자열 풀'을 사용한다.

            str1를 초기화할 때 "hello"가 문자열 풀에 생성되고 str2가 풀에 있는 문자열을 참조하기 때문에
            참조값이 같아 == 비교시에도 true가 나오게 된다.

            문자열 풀은 힙 영역을 사용한다.
            문자열 풀에서 문자를 찾을 때는 해시를 사용해서 빠른속도로 찾을 수 있다.
         */

    }
}
