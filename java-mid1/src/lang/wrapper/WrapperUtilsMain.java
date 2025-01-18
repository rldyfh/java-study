package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        Integer i = Integer.valueOf(10); // Integer 래퍼클래스를 반환한다.
        int i2 = Integer.parseInt("10"); // primitive int 타입을 반환한다.


        /*
            유지보수 vs 최적화
             - wrapper 클래스를 사용할건지, primitive한 타입을 사용할건지는 상황마다 다름.
             - wrapper클래스가 primitive보다 느리지만 애플리케이션단에서 느린건 네트워크 통신하는거에 비해서 매우 적은 시간.
             - 유지 보수가 쉽도록 코드를 짜고
             - 성능에 이슈가 있을 경우 최적화를 한다.
         */
    }
}
