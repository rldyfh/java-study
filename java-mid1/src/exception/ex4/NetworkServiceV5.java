package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        // try 블럭을 빠져나가는 순간 close()가 실행된다. (try-catch-finally 는 이 순으로 실행됐지만...)
        // close() -> catch의 [예외 확인]
        try(NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch(Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
