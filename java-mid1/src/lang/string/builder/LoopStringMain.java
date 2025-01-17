package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {

        // 더럽게 오래 걸림
//        long startTime = System.currentTimeMillis();
//        String result = "";
//        for(int i = 0 ; i < 1000000 ; i++)
//            result += "Hello Java";
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("result = " + result);
//        System.out.println("time = " + (endTime - startTime));


        // 문자열의 변화가 많을 때 StringBuilder가 압도적으로 빠르다.
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 1000000 ; i++)
            sb.append("Hello Java");
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + sb);
        System.out.println("time = " + (endTime - startTime)); // 28ms


        /*
            StringBuilder 와 StringBuffer
            StringBuffer는 내부에 동기화가 되어있어 멀티스레드 환경에서 안전, 그러나 오버헤드로 인한 성능 이슈가 있다.
            StringBuilder는 멀티 스레드에서 안전하지 않음. 그러나 속도가 빠르다.
         */

    }
}
