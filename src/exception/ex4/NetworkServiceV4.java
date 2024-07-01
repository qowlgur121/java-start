package exception.ex4;

public class NetworkServiceV4 {
    //NetworkClient의 복잡한 로직을 처리한다.

    public void sendMessage(String data) {
        String address = "http://example.com"; //여기에 접속하려고 한다.
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); //추가

        /**
         * 수 많은 예외가 발생하면 하나하나 일일히 잡기 힘드니까 아래와 같은 로직으로 짜봤다.
         */
        try { //정상흐름
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }

    }
}
