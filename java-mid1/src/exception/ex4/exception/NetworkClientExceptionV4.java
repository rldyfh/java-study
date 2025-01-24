package exception.ex4.exception;

/*
    예외를 분리
                RuntimeException
                    |
        NetworkClientExceptionV4
                /              \
               /                \
  ConnectionExceptionV4      SendExceptionV4
 */
public class NetworkClientExceptionV4 extends RuntimeException{
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
