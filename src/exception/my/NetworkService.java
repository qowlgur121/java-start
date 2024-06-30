package exception.my;

public class NetworkService {

    private String address = "http://example.com";
    private NetworkClient networkClient = new NetworkClient(address);

    public void sendMessage(String message) {
        networkClient.connect();
        networkClient.send(message);
        networkClient.disconnect();
    }
}
