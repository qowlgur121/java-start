package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
    public static class NetworkMessage {
        /*
         사실 정적 중첩 클래스는 바깥 클래스와 관련이 없다. 그런데 왜 쓸까?
         그 이유 중 하나는 바깥 클래스는 정적 중첩 클래스에 있는 private 변수를 쓸 수 있다.
         그래서 public을 안쓸 수 있는 장점이 있다
         */
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
