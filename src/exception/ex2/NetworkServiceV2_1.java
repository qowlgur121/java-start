package exception.ex2;

public class NetworkServiceV2_1 {
    //NetworkClient의 복잡한 로직을 처리한다.

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com"; //여기에 접속하려고 한다.
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
