package poly.my.sender;

public class InstaSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("디엠을 발송합니다: " + message);
    }
}
