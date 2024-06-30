package exception.ex0;

public class NetworkServiceV0 {
    //NetworkClient의 복잡한 로직을 처리한다.

    public void sendMessage(String data) {
        String address = "http://example.com"; //여기에 접속하려고 한다.
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.discount();
    }
}
