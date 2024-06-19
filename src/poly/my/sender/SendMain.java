package poly.my.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new InstaSender()};
        for (Sender sender : senders) {
            sender.sendMessage("빨리 와요!!!");
        }
    }

}
