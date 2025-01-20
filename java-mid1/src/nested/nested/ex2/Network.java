package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage message = new NetworkMessage(text);
        message.print();
    }

    // private 으로 설정된것을 보아 Network 클래스에서만 쓰이는 클래스이겠구나 라고 인지할 수 있다.
    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

}
