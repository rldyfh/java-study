package exception.ex3.exception;

/*
    예외를 분리
                Exception
                    |
        NetworkClientExceptionV3
                /              \
               /                \
  ConnectionExceptionV3      SendExceptionV4
 */
public class NetworkClientExceptionV3 extends Exception{
    public NetworkClientExceptionV3(String message) {
        super(message);
    }
}
